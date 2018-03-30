package factory.method4;

import factory.base.Sender;

import java.lang.reflect.InvocationTargetException;

public class FactoryTest {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        Sender sender = SendFactory.getSender("sms");
        System.out.println(sender.sender("sms msg 4"));

        Sender sender1 = SendFactory.getSender("mail");
        System.out.println(sender1.sender("email msg 4"));
    }
}
