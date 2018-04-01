package singleton.Volatile;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description 采用Lock
 */
public class VolatileTest3 {
	
	public int inc = 0;
	
	Lock lock = new ReentrantLock();

	public void increase() {
		lock.lock();
		try {
			inc++;
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis() ;
		
		final VolatileTest3 test = new VolatileTest3();
		
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				for (int j = 0; j < 1000; j++)
					test.increase();
			}).start();
		}

		while (Thread.activeCount() > 1) // 保证前面的线程都执行完
			Thread.yield();
		
		System.out.println("耗时:" + (System.currentTimeMillis()-currentTimeMillis));
        
		System.out.println(test.inc);
	}

}


/*
 摘自《深入理解Java虚拟机》：

“观察加入volatile关键字和没有加入volatile关键字时所生成的汇编代码发现，加入volatile关键字时，会多出一个lock前缀指令”

lock前缀指令实际上相当于一个内存屏障（也成内存栅栏），内存屏障会提供3个功能：

	1）它确保指令重排序时不会把其后面的指令排到内存屏障之前的位置，也不会把前面的指令排到内存屏障的后面；即在执行到内存屏障这句指令时，在它前面的操作已经全部完成；
	
	2）它会强制将对缓存的修改操作立即写入主存；
	
	3）如果是写操作，它会导致其他CPU中对应的缓存行无效。
*/
