import java.util.List;

public interface ArticleRepository extends Repository<Article, String> {
    List<Article> readLatestArticles();

    List<Article> readByTags(List<String> tags);
}
