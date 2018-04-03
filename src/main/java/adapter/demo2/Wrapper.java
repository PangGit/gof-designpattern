package adapter.demo2;

import adapter.demo1.Source;
import adapter.demo1.TargetAble;

/*对象的适配器模式*/
public class Wrapper implements TargetAble {

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
