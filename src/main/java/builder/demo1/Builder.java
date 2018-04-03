package builder.demo1;

import base.MailSender;
import base.Sender;
import base.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PC-20170417-666
 * @version 1.0.0
 * @Description : 建造者类
 * @Date 2018/4/2 10:10
 */
public class Builder {

    List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }


}
