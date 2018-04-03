package builder.demo2;

/**
 * 指挥者类，用来指挥建造过程
 */
public class Director {

    public void construct(AbstractBuilder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
