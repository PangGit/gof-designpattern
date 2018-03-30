package factory.method2;

import factory.base.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();

        Sender sender = factory.produceSms();
        System.out.println(sender.sender("sms msg2"));

        Sender sender1 = factory.produceMail();
        System.out.println(sender1.sender("email msg2"));
    }
}
