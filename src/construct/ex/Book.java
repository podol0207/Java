package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
    public Book() {
        this("", "", 0);
    }
    public Book(String title, String author) {
        this(title, author, 19);
    }
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
}
