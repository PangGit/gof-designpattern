package factorymethod.method1;

import factorymethod.base.MailSender;
import factorymethod.base.Sender;
import factorymethod.base.SmsSender;

/**
 * @ClassName SendFactory
 * @Description 1.1、普通工厂模式
 * @author PC-20170417-666
 * @Date 2018年3月30日 上午11:36:26
 * @version 1.0.0
 */
public class SendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
    
    

}