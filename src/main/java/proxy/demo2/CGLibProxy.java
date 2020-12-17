package proxy.demo2;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLibProxy动态代理类
 *
 * @author Pangdb
 */
public class CGLibProxy implements MethodInterceptor {

    /**
     * CGLib需要代理的目标对象
     */
    private Object targetObject;

    public Object createProxyObject(Object obj) {
        this.targetObject = obj;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        // 返回代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object obj;
        // 过滤方法
        if ("addUser".equals(method.getName())) {
            // 检查权限
            checkPermission();
        }
        obj = method.invoke(targetObject, args);
        return obj;
    }

    private void checkPermission() {
        System.out.println("======检查权限==cglib====");
    }
}
