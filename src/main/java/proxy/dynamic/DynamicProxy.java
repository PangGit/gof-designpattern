package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class DynamicProxy implements InvocationHandler {

    private Object obj;

    // 绑定委托对象，并返回代理类
    public Object bind(Object obj){
        this.obj = obj;
        // 绑定该类实现的所有接口，取得代理类
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), obj.getClass().getInterfaces(), this);
        // 通过 Proxy.newProxyInstance 创建的代理对象是在jvm运行时动态生成的一个对象，它并不是我们的InvocationHandler类型，也不是我们定义的那组接口的类型，
        // 而是在运行是动态生成的一个对象，并且命名方式都是这样的形式，以$开头，proxy为中，最后一个数字表示对象的标号。

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable { //不依赖具体接口实现
        //被代理的类型为Object基类
        Object result = null;

        //这里就可以进行所谓的AOP编程了
        System.out.println("---------在调用具体函数方法前，执行功能处理---------");
        result = method.invoke(obj,args);
        System.out.println("---------在调用具体函数方法后，执行功能处理---------");

        return result;
    }

}
