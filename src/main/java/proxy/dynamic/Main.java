package proxy.dynamic;

import java.io.IOException;

/**
 * 具体调用
 */
public class Main {

    public static void main(String[] str) {

        //method1();

        method2();

    }

    public static void method1() {
        // 用户信息
        User user = new User();
        user.setCardCode("510522177709096836");
        user.setSex("男");
        user.setName("无名氏");
        user.setHomeAddress("地球村第七号店铺");

        // 创建买票者
        IProxy realProxy = new RealProxy(user);

        // 创建动态代理
        DynamicProxy dynamicProxy = new DynamicProxy();

        // 动态构建一个代理站点
        IProxy iProxy = (IProxy) dynamicProxy.bind(realProxy);
        iProxy.buyTicket();
    }


    public static void method2() {
        // 把代理类的字节码写到硬盘上
        ProxyGeneratorUtils.writeProxyClassToHardDisk("D:/$Proxy0.class");
    }
}
