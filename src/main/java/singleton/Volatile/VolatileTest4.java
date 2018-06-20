package singleton.Volatile;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description 采用AtomicInteger
 */
public class VolatileTest4 {

    public AtomicInteger inc = new AtomicInteger();

    public void increase() {
        inc.getAndIncrement(); //Atomically increments by one the current value.
    }

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();

        final VolatileTest4 test = new VolatileTest4();

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
 * 在java 1.5的java.util.concurrent.atomic包下提供了一些原子操作类，
 *
 * 即对基本数据类型的 自增（加1操作），自减（减1操作）、以及加法操作（加一个数），减法操作（减一个数）进行了封装，保证这些操作是原子性操作。
 *
 * atomic是利用CAS（Compare And Swap）来实现原子性操作的，CAS实际上是利用处理器提供的CMPXCHG指令实现的，而处理器执行CMPXCHG指令是一个原子性操作。
 */

/*cmpxchg是汇编指令
 * 作用：比较并交换操作数.
 * 如：CMPXCHG r/m,r 将累加器AL/AX/EAX/RAX中的值与首操作数（目的操作数）比较，
 * 		如果相等，第2操作数（源操作数）的值装载到首操作数，zf置1。
 * 		如果不等， 首操作数的值装载到AL/AX/EAX/RAX并将zf清0
 * 该指令只能用于486及其后继机型。第2操作数（源操作数）只能用8位、16位或32位寄存器。第1操作数（目地操作数）则可用寄存器或任一种存储器寻址方式。*/
