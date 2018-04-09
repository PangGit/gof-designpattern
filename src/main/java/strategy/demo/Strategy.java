package strategy.demo;

/**
 * 策略接口
 */
public interface Strategy {
    String getValue(Integer a, Integer b);
}

class ConcreteStrategyA implements Strategy {
    public ConcreteStrategyA(){
        System.out.println("策略A的具体算法实现");
    }

    @Override
    public String getValue(Integer a, Integer b) {
        return String.valueOf(a + b);
    }

}

class ConcreteStrategyB implements Strategy {
    public ConcreteStrategyB(){
        System.out.println("策略B的具体算法实现");
    }

    @Override
    public String getValue(Integer a, Integer b) {
        return String.valueOf(a - b);
    }

}

class ConcreteStrategyC implements Strategy {
    public ConcreteStrategyC(){
        System.out.println("策略C的具体算法实现");
    }

    @Override
    public String getValue(Integer a, Integer b) {
        return String.valueOf(a * b);
    }

}