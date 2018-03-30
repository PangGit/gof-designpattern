package factory.method3;

import factory.base.MailSender;
import factory.base.Sender;
import factory.base.SmsSender;

/**
 * @Description : 静态工厂方法模式
 */
public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
