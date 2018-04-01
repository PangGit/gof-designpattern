package singleton;

import java.util.Vector;

/**
 * @author PC-20170417-666
 * @version 1.0.0
 * @Description : 采用"影子实例"的办法为单例对象的属性同步更新
 * @Date 2018/4/1 15:57
 */
public class Singleton4 {

    private static Singleton4 instance = null;

    private Vector properties = null;

    public Vector getProperties(){
        return properties;
    }

    private Singleton4(){}

    private static synchronized void syncInit(){
        if (instance == null){
            instance = new Singleton4();
        }
    }

    private static Singleton4 getInstance(){
        if (instance == null){
            syncInit();
        }
        return  instance;
    }
}
