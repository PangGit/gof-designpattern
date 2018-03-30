package factorymethod.base;

public class SmsSender implements Sender {
    public void sender() {
        System.out.println("this is sms sender!");
    }
}
