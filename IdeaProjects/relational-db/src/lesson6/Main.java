package lesson6;

public class Main {
    public static void main(String[] args) {
        Author author = new Author(1, "test");
        Article article = new Article(1, "testHeader", "testText",author);
    }
}
