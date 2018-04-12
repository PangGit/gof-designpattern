package command.gof;

/**
 * 被调用者（士兵）
 */
public class Receiver {

    public void action() {
        System.out.println("command received!");
    }
}
