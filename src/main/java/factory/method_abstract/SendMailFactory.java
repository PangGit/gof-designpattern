package factory.method_abstract;

import factory.base.MailSender;
import factory.base.Sender;

/**
 * @author PC-20170417-666
 * @version 1.0.0
 * @Description :
 * @Date 2018/3/30 16:06
 */
public class SendMailFactory implements Provider {
    public Sender produce() {
        return new MailSender();
    }
}
