package adapter.demo1;

/*类的适配器模式*/
public class Adapter extends Source implements TargetAble {

    @Override
    public void method2() {
        System.out.println("this is the targetAble method!");
    }
}
