package factory.method1;

import factory.base.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();

        Sender sender = factory.produce("sms");
        System.out.println(sender.sender("sms msg1"));

        sender = factory.produce("mail");
        System.out.println(sender.sender("mail msg1"));
    }
}
