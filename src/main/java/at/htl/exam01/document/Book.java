package at.htl.exam01.document;

public class Book extends Document {
    //region Getter und Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //endregion
    private String title;

    public Book(String author, String title) {
        super(author);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: '" + title + "' von '" + super.getAuthor() + "'";
    }


}
