/*
 * SPDX-License-Identifier: MIT
 */
package org.ta4j.core.num;

public class DoubleNumFactory implements NumFactory {

    private static final DoubleNumFactory DOUBLE_NUM_FACTORY = new DoubleNumFactory();

    private DoubleNumFactory() {
        // hidden
    }

    @Override
    public Num minusOne() {
        return DoubleNum.MINUS_ONE;
    }

    @Override
    public Num zero() {
        return DoubleNum.ZERO;
    }

    @Override
    public Num one() {
        return DoubleNum.ONE;
    }

    @Override
    public Num two() {
        return DoubleNum.TWO;
    }

    @Override
    public Num three() {
        return DoubleNum.THREE;
    }

    @Override
    public Num hundred() {
        return DoubleNum.HUNDRED;
    }

    @Override
    public Num thousand() {
        return DoubleNum.THOUSAND;
    }

    @Override
    public Num four() {
        return DoubleNum.valueOf(4);
    }

    @Override
    public Num ten() {
        return DoubleNum.valueOf(10);
    }

    @Override
    public Num twenty() {
        return DoubleNum.valueOf(20);
    }
 
    @Override
    public Num thirty() {
        return DoubleNum.valueOf(30);
    }

    @Override
    public Num forty() {
        return DoubleNum.valueOf(40);
    }

    @Override
    public Num fifty() {
        return DoubleNum.valueOf(50);
    }

    @Override
    public Num sixty() {
        return DoubleNum.valueOf(60);
    }

    @Override
    public Num seventy() {
        return DoubleNum.valueOf(70);
    }

    @Override
    public Num eighty() {
        return DoubleNum.valueOf(80);
    }

    @Override
    public Num ninety() {
        return DoubleNum.valueOf(90);
    }

    @Override
    public Num numOf(final Number number) {
        return DoubleNum.valueOf(number);
    }

    @Override
    public Num numOf(final String number) {
        return DoubleNum.valueOf(number);
    }

    public static DoubleNumFactory getInstance() {
        return DOUBLE_NUM_FACTORY;
    }

    private Object readResolve() {
        return DOUBLE_NUM_FACTORY;
    }
}
