package factory.method_abstract;

import factory.base.Sender;

/**
 * @author PC-20170417-666
 * @version 1.0.0
 * @Description :
 * @Date 2018/3/30 16:08
 */
public class SenderTest {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        System.out.println(sender.sender(" abstract mail msg "));

        provider = new SendSmsFactory();
        sender = provider.produce();
        System.out.println(sender.sender("abstract sms msg "));
    }

}
