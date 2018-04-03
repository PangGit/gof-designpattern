package factory.method_multi;

import base.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();

        Sender sender = factory.produceSms();
        System.out.println(sender.sender());

        Sender sender1 = factory.produceMail();
        System.out.println(sender1.sender());
    }
}
