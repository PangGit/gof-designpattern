package singleton;

/**
 * @Description : 单例模式 test
 * @Author : pang
 * @Date 2018/4/22 23:37
 */
public class Test {

    public static void main(String[] args) {

        SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance();
        singletonThreadSafe.test();



    }

}
