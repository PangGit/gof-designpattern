package factory.method2;

import factory.base.MailSender;
import factory.base.Sender;
import factory.base.SmsSender;

/**
 * @Description : 多个工厂方法模式
 */
public class SendFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
