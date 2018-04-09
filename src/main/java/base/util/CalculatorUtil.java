package base.util;

/**
 * @author PC-20170417-666
 * @version 1.0.0
 * @Description :
 * @Date 2018/4/8 14:31
 */
public class CalculatorUtil {

    /**
     * @Description : 策略模式、模板方法模式 公用方法
     * @param: String exp, String opt
     * @return: int[]
     * @auther: PC-20170417-666
     * @date: 2018/4/8 14:32
     */
    public static int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
    
}
