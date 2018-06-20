package builder.demo1;

/**
 * @author PC-20170417-666
 * @version 1.0.0
 * @Description :
 * @Date 2018/4/2 10:14
 */
public class BuilderTest {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(3);
        builder.produceSmsSender(2);

        for (int i = 0; i < builder.list.size(); i++) {
            String msg = builder.list.get(i).sender();
            System.out.println(msg);
        }
    }

}
