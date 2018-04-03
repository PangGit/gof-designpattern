package factory.method_general;

import base.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();

        Sender sender = factory.produce("sms");
        System.out.println(sender.sender());

        sender = factory.produce("mail");
        System.out.println(sender.sender());
    }
}
