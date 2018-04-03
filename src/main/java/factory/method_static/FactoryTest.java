package factory.method_static;

import base.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceSms();
        System.out.println(sender.sender());

        Sender sender1 = SendFactory.produceMail();
        System.out.println(sender1.sender());
    }
}
