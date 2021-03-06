package chainofresponsibility.demo;

/**
 * 向链上的具体处理者对象提交请求
 */
public class Client {
    public static void main(String[] args) {

        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        int[] requests = {2, 14, 25, 6, 18, 23, 12, 21};

        for (int i : requests) {
            handlerA.handleRequest(i);
        }
    }
}
