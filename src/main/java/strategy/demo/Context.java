package strategy.demo;

/**
 * 上下文
 */
public class Context {
    private Strategy strategy;
    private Strategy2 strategy2;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context(Strategy2 strategy2) {
        this.strategy2 = strategy2;
    }

    public Context(char type) {
        switch (type) {
            case 'A':
                this.strategy = new ConcreteStrategyA();
                break;
            case 'D':
                this.strategy2 = new ConcreteStrategyD();
                break;
            default:
                break;
        }
    }

    /**
     * 运算
     */
    public void getValue(Integer a, Integer b) {
        System.out.println(strategy.getValue(a, b));
    }

    /**
     * 运算2
     */
    public void getValue2(Integer a, Integer b) {
        System.out.println(strategy2.getValue(a, b));
    }

}