package factory.method_static;

import base.MailSender;
import base.Sender;
import base.SmsSender;

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
