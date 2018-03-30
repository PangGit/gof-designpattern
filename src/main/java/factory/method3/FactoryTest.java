package factory.method3;

import factory.base.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceSms();
        System.out.println(sender.sender("sms msg3"));

        Sender sender1 = SendFactory.produceMail();
        System.out.println(sender1.sender("email msg3"));
    }
}
