package builder.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类，由多个部件组成
 */
public class Product {
    List<String> parts = new ArrayList<String>();

    // 添加产品部件
    public void add(String part) {
        parts.add(part);
    }

    // 列举所有的产品部件
    public void show() {
        System.out.println("---产品 创建---");

        parts.forEach(System.out::println);
    }
}
