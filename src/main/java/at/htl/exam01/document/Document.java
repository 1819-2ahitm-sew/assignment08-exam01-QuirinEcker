package at.htl.exam01.document;

abstract public class Document {
    //region Getter und Setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    //endregion
    private String author;

    public Document() {

    }
}
