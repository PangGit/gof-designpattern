package singleton;

/**
 * 线程安全的写法，单例模式最优写法
 */
public class SingletonThreadSafe {

    /*
     * volatile 修饰一个共享变量（类的成员变量、类的静态成员变量）之后，那么就具备了两层语义：
     * 1）保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。
     * 2）禁止进行指令重排序。
     */
    private static volatile SingletonThreadSafe instance = null;

    private SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getInstance() {
        // Double-Check-Locking (双重锁定)
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
/*
 * 并发编程中的三个概念
 * 1.原子性:即一个操作或者多个操作 要么全部执行并且执行的过程不会被任何因素打断，要么就都不执行。
 * 2.可见性:指当多个线程访问同一个变量时，一个线程修改了这个变量的值，其他线程能够立即看得到修改的值。
 * 3.有序性：即程序执行的顺序按照代码的先后顺序执行。
 */
