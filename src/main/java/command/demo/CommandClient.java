package command.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个具体命令对象并设定它的接收者
 */
public class CommandClient {

    public static void main(String[] args) {
        List<Receiver> receivers = new ArrayList<>();
        receivers.add(new ReceiverA());
        receivers.add(new ReceiverB());
        receivers.add(new ReceiverC());

        Command command = new ConcreteCommand(receivers);
        command.addReceivers(() -> System.out.println("ReceiverD 执行请求！"));

        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}