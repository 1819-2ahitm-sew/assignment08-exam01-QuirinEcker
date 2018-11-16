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
    String subject;
    String to;

    public Email() { }
    public Email(String author, String subject, String to) {

    }
}
