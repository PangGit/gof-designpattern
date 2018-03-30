package factory.base;

public class MailSender implements Sender {
    public String sender(String msg) {
        return "this is mail sender! msg : "+msg;
    }
}
