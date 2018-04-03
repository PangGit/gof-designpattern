package adapter;

import adapter.demo1.Adapter;
import adapter.demo1.Source;
import adapter.demo2.Wrapper;
import adapter.demo3.Source1;
import adapter.demo3.Source2;
import adapter.demo3.Wrapper2;

public class AdapterTest {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.method1();
        adapter.method2();

        Source source = new Source();
        Wrapper wrapper = new Wrapper(source);
        wrapper.method1();
        wrapper.method2();

        Wrapper2 wrapper2 = new Source1();
        wrapper2.method1();

        wrapper2 = new Source2();
        wrapper2.method2();
    }
}
