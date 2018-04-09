package template.gof;

import base.util.CalculatorUtil;

/**
 *
 */
public abstract class AbstractCalculator {

    /*主方法，实现对本类其它方法的调用*/
    public final int calculate(String exp, String opt) {
        int array[] = split(exp, opt);
        return calculate(array[0], array[1]);
    }

    /*被子类重写的方法*/
    abstract public int calculate(int num1, int num2);

    public int[] split(String exp, String opt) {
        return CalculatorUtil.split(exp, opt);
    }

}
