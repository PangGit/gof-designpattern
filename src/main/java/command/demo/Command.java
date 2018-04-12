package command.demo;

import java.util.List;

/**
 * 用来声明执行操作的接口
 */
public abstract class Command {

    protected List<Receiver> receivers;

    public Command(List<Receiver> receivers) {
        this.receivers = receivers;
    }

    public void addReceivers(Receiver receiver) {
        this.receivers.add(receiver);
    }

    public abstract void execute();
}

// 将一个接收者对象绑定于一个动作，调用接收者相应的操作，以实现execute
class ConcreteCommand extends Command {

    public ConcreteCommand(List<Receiver> receivers) {
        super(receivers);
    }

    @Override
    public void execute() {
        for (Receiver receiver : receivers) {
            receiver.action();
        }
    }
}
