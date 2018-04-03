package decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Sourceable sourceable = new Source();

        Sourceable source = new Decorator(sourceable);
        source.method();
    }
}
