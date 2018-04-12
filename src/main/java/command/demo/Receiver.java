package command.demo;

/**
 * 知道如何实施与执行一个与请求相关的操作，任何类都可能作为一个接收者。
 * 真正执行请求的地方！
 */
interface Receiver {
    void action();
}

class ReceiverA implements Receiver {
    @Override
    public void action() {
        System.out.println("ReceiverA 执行请求！");
    }
}

class ReceiverB implements Receiver {
    @Override
    public void action() {
        System.out.println("ReceiverB 执行请求！");
    }
}

class ReceiverC implements Receiver {
    @Override
    public void action() {
        System.out.println("ReceiverC 执行请求！");
    }
}
