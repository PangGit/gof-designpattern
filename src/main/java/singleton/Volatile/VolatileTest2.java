package singleton.Volatile;

/**
 * @Description 采用synchronized
 */
public class VolatileTest2 {

    public int inc = 0;

    public synchronized void increase() {
        inc++;
    }

    public static void main(String[] args) {

        long currentTimeMillis = System.currentTimeMillis();

        final VolatileTest2 test = new VolatileTest2();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++)
                    test.increase();
            }).start();
        }

        while (Thread.activeCount() > 1)  //保证前面的线程都执行完
            Thread.yield();

        System.out.println("耗时:" + (System.currentTimeMillis() - currentTimeMillis));

        System.out.println(test.inc);
    }
}


/*
 * 由于synchronized和Lock能够保证任一时刻只有一个线程执行该代码块，那么自然就不存在原子性问题了，从而保证了原子性。
 *
 * synchronized和Lock能保证同一时刻只有一个线程获取锁,然后执行同步代码，并且在释放锁之前会将对变量的修改刷新到主存当中,因此可以保证可见性。
 *
 * synchronized和Lock保证每个时刻是有一个线程执行同步代码，相当于是让线程顺序执行同步代码，自然就保证了有序性
 */


/*
 * synchronized关键字是防止多个线程同时执行一段代码，那么就会很影响程序执行效率，而volatile关键字在某些情况下性能要优于synchronized，
 * 但是要注意volatile关键字是无法替代synchronized关键字的，因为volatile关键字无法保证操作的原子性。
 *
 * 通常来说，使用volatile必须具备以下2个条件：
 * 	1）对变量的写操作不依赖于当前值
 * 	2）该变量没有包含在具有其他变量的不变式中
 *
 * 实际上，这些条件表明，可以被写入 volatile 变量的这些有效值独立于任何程序的状态，包括变量的当前状态。
 */