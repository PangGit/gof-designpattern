package strategy.demo;

/**
 * 策略接口
 */
public interface Strategy2 {
    String getValue(Integer a, Integer b);
}

class ConcreteStrategyD implements Strategy2 {
    public ConcreteStrategyD() {
        System.out.println("策略D的具体算法实现");
    }

    @Override
    public String getValue(Integer a, Integer b) {
        return String.valueOf(a + b);
    }
}