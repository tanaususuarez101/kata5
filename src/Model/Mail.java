package Model;

public class Mail {
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getDominio() {
        return mail.split("@")[1];
    }
}