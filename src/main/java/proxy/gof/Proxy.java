package proxy.gof;

public class Proxy implements SourceAble {

    private SourceAble sourceable;

    public Proxy() {
        sourceable = new Source();
    }

    @Override
    public void method() {
        before();
        sourceable.method();
        atfer();
    }

    private void atfer() {
        System.out.println("after proxy!");
    }

    private void before() {
        System.out.println("before proxy!");
    }
}
