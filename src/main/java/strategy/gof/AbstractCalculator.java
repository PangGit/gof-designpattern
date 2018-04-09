package strategy.gof;

import base.util.CalculatorUtil;

/**
 *
 */
public abstract class AbstractCalculator {

    public int[] split(String exp, String opt) {
        return CalculatorUtil.split(exp, opt);
    }
}
