package strategy.demo;

/**
 * 客户端使用策略
 */
public class StrategyClient {
    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.getValue(1, 2);

        context = new Context(new ConcreteStrategyB());
        context.getValue(1, 2);

        context = new Context(new ConcreteStrategyC());
        context.getValue(1, 2);

        context = new Context(new ConcreteStrategyD());
        context.getValue2(1, 2);

        context = new Context('D');
        context.getValue2(2, 4);
    }
}