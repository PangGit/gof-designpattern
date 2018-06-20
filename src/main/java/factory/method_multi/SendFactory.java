package factory.method_multi;

import base.MailSender;
import base.Sender;
import base.SmsSender;

/**
 * @Description : 多个工厂方法模式
 */
public class SendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
