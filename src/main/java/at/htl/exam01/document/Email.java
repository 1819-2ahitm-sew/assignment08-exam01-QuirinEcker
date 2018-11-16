package at.htl.exam01.document;

public class Email extends Document{
    //region Getter und Setter
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
    //endregion
    private String subject;
    private String to;

    public Email(String author, String subject, String to) {
        super(author);
        this.subject = subject;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Email: '" + subject + "' von '" + super.getAuthor() + "' an '" + to + "'";
    }
}
