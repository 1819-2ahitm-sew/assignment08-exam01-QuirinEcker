package at.htl.exam01.document;

public class Book extends Document {
    //region Getter und Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    //endregion
    private String title;
    private String author;

    public Book() {}
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }


}
