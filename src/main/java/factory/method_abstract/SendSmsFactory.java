package factory.method_abstract;

import factory.base.Sender;
import factory.base.SmsSender;

/**
 * @author PC-20170417-666
 * @version 1.0.0
 * @Description :
 * @Date 2018/3/30 16:07
 */
public class SendSmsFactory implements Provider {
    public Sender produce() {
        return new SmsSender();
    }
}
