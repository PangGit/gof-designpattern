package proxy.demo2;

/**
 * 代理模式[[ 客户端--》代理对象--》目标对象 ]]
 * <p>
 * https://blog.csdn.net/yhl_jxy/article/details/80635012
 * <p>
 * JDK动态代理和CGLIB字节码生成的区别？
 * 1）JDK动态代理只能对实现了接口的类生成代理，而不能针对类。
 * 2）CGLIB是针对类实现代理，主要是对指定的类生成一个子类，覆盖其中的方法，并覆盖其中方法实现增强，
 * 但是因为采用的是继承，所以该类或方法最好不要声明成final，对于final类或方法，是无法继承的。
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("**********************CGLibProxy**********************");
        CGLibProxy cgLibProxy = new CGLibProxy();
        IUserManager userManager = (IUserManager) cgLibProxy.createProxyObject(new UserManagerImpl());
        userManager.addUser("name1", "123456");

        System.out.println("**********************JDKProxy**********************");
        JDKProxy jdkProxy = new JDKProxy();
        IUserManager userManagerJDK = (IUserManager) jdkProxy.newProxy(new UserManagerImpl());
        userManagerJDK.addUser("name2", "123456");
    }
}
