package proxy.gof;

public class Source implements SourceAble {
    @Override
    public void method() {
        System.out.println("proxy : the original method!");
    }
}
