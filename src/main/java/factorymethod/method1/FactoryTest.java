package factorymethod.method1;

import factorymethod.base.Sender;

public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.sender();
    }

}
