## Repository Architectural Pattern

Repository pattern have two purposes; first it is an abstraction of the data layer and second it is a way of centralising the handling of the domain objects.

Repository layer is added between the domain and data mapping layers to isolate domain objects from
details of the database access code and to minimize scattering and duplication of query code. The
Repository pattern is especially useful in systems where number of domain classes is large or heavy
querying is utilized.

Repository architectural pattern creates a uniform layer of data repositories that can be used for
CRUD operations.

Repositories are classes or components that encapsulate the logic required to access data sources.
They centralize common data access functionality, providing better maintainability and decoupling
the infrastructure or technology used to access databases from the domain model layer.

Data Access Objects

    public interface ArticleDao {

        List<Article> readAll();

        List<Article> readLatest();

        List<Article> readByTags(Tag... tags);

        Article readById(long id);

        Article create(Article article);

        Article update(Article article);

        Article delete(Article article);

    }

    public interface SomeOtherDao {
        .
        .
        .
    }

Abstraction
The idea with this pattern is to have a generic abstract way for the app to work with the data layer without being bother with if the implementation is towards a local database or towards an online API.

    public interface Repository<T> {
    List<T> readAll();

        T read(Criteria criteria);
        T create(T entity);
        T update(T entity);
        T delete(T entity);

    }

It is a nice generic abstraction. But let’s look at the implementation specially the read(Criteria criteria) method. Implementing a criteria working with data in memory is simple, let’s call it MemoryCriteria. Implementing one towards SQLite is fairly simple, let’s call that one SQLiteCriteria. The component using this repository have to chose what criteria to use, the criteria is written towards a specific implementation. This breaks the idea of having the app or component working with the repository without knowing about the actual implementation.

Compromise
I chose to compromise and go half way between the repository and my old DAOs. I have my interface with all the CRUD methods. I also add one more method readById(K id). This interface will cover most of my basic use cases.

    public interface Repository<T, K> {
        List<T> read();

        T readById(K id);
        T create(T entity);
        T update(T entity);
        T delete(T entity);
    }

Criteria
We still need a way to get specific selection out of the repository. This is where I compromise.

Say we have a model called Article and we have the need of getting the latest once and the once tagged with certain tags. Let’s add another layer of interface containing these methods.

    public interface ArticleRepository extends Repository<Article, Long> {
        List<Article> read();
        Article readById(Long id);
        Article create(Article article);
        Article update(Article article);
        Article delete(Article article);
        List<Article> readLatest();
        List<Article> readByTags(Tag...tags);
    }
