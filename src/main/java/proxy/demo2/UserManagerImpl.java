package proxy.demo2;

/**
 * 用户管理接口实现(被代理的实现类)
 */
public class UserManagerImpl implements IUserManager {

    @Override
    public void addUser(String id, String password) {
        System.out.println("======调用addUser()方法, id=" + id + ",psd=" + password);
    }
}