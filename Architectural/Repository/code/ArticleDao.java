import java.util.List;

public interface ArticleDao {
    public List<Article> readAll();

    public Article readByID(String id);

    public Article create(Article article);

    public Article delete(Article article);

    public Article update(Article article);
}