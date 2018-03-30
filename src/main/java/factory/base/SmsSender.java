package factory.base;

public class SmsSender implements Sender {
    public String sender(String msg) {
        return "this is Sms sender! msg : "+msg;
    }
}
