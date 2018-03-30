package factory.method4;

import factory.base.MailSender;
import factory.base.Sender;
import factory.base.SmsSender;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description : 反射 + 简单工厂
 */
public class SendFactory {

    private static Map<String, Class<?>> allSender = new HashMap<String, Class<?>>();

    public static void fullMap() {
        allSender.put("sms", SmsSender.class);
        allSender.put("mail", MailSender.class);
    }

    public static Sender getSender(String type) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        fullMap();

        Class<?> senderClass = allSender.get(type);
        if (senderClass == null) {
            throw new RuntimeException("unsupported operation");
        }

        Sender sender = (Sender) senderClass.getDeclaredConstructor().newInstance();
        return sender;
    }


}
