package factory.method_abstract;

import factory.base.Sender;

/**
 * @author PC-20170417-666
 * @version 1.0.0
 * @Description : 工厂接口
 * @Date 2018/3/30 16:04
 */
public interface Provider {
    public Sender produce();
}
