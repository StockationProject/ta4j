/*
 * SPDX-License-Identifier: MIT
 */
package org.ta4j.core.num;

import java.math.MathContext;

public class DecimalNumFactory implements NumFactory {

    private final MathContext mathContext;
    private final DecimalNum minusOne;
    private final DecimalNum zero;
    private final DecimalNum one;
    private final DecimalNum two;
    private final DecimalNum three;
    private final DecimalNum four;
    private final DecimalNum ten;
    private final DecimalNum twenty;
    private final DecimalNum thirty;
    private final DecimalNum forty;
    private final DecimalNum fifty;
    private final DecimalNum sixty;
    private final DecimalNum seventy;
    private final DecimalNum eighty;
    private final DecimalNum ninety;
    private final DecimalNum hundred;
    private final DecimalNum thousand;

    private DecimalNumFactory(final MathContext mathContext) {
        this.mathContext = mathContext;
        this.minusOne = DecimalNum.valueOf(-1, mathContext);
        this.zero = DecimalNum.valueOf(0, mathContext);
        this.one = DecimalNum.valueOf(1, mathContext);
        this.two = DecimalNum.valueOf(2, mathContext);
        this.three = DecimalNum.valueOf(3, mathContext);
        this.four = DecimalNum.valueOf(4, mathContext);
        this.ten = DecimalNum.valueOf(10, mathContext);
        this.twenty = DecimalNum.valueOf(20, mathContext);
        this.thirty = DecimalNum.valueOf(30, mathContext);
        this.forty = DecimalNum.valueOf(40, mathContext);
        this.fifty = DecimalNum.valueOf(50, mathContext);
        this.sixty = DecimalNum.valueOf(60, mathContext);
        this.seventy = DecimalNum.valueOf(70, mathContext);
        this.eighty = DecimalNum.valueOf(80, mathContext);
        this.ninety = DecimalNum.valueOf(90, mathContext);
        this.hundred = DecimalNum.valueOf(100, mathContext);
        this.thousand = DecimalNum.valueOf(1000, mathContext);
    }

    public static NumFactory getInstance() {
        return getInstance(DecimalNum.getDefaultMathContext());
    }

    public static NumFactory getInstance(final int precision) {
        final var roundingMode = DecimalNum.getDefaultMathContext().getRoundingMode();
        return new DecimalNumFactory(new MathContext(precision, roundingMode));
    }

    public static NumFactory getInstance(final MathContext mathContext) {
        return new DecimalNumFactory(mathContext);
    }

    @Override
    public Num minusOne() {
        return this.minusOne;
    }

    @Override
    public Num zero() {
        return this.zero;
    }

    @Override
    public Num one() {
        return this.one;
    }

    @Override
    public Num two() {
        return this.two;
    }

    @Override
    public Num three() {
        return this.three;
    }

    @Override
    public Num four() {
        return this.four;
    }

    @Override
    public Num ten() {
        return this.ten;
    }

    @Override
    public Num twenty() {
        return this.twenty;
    }

    @Override
    public Num thirty() {
        return this.thirty;
    }

    @Override
    public Num forty() {
        return this.forty;
    }

    @Override
    public Num fifty() {
        return this.fifty;
    }

    @Override
    public Num sixty() {
        return this.sixty;
    }

    @Override
    public Num seventy() {
        return this.seventy;
    }

    @Override
    public Num eighty() {
        return this.eighty;
    }

    @Override
    public Num ninety() {
        return this.ninety;
    }

    @Override
    public Num hundred() {
        return this.hundred;
    }

    @Override
    public Num thousand() {
        return this.thousand;
    }

    @Override
    public Num numOf(final Number number) {
        return numOf(number.toString());
    }

    @Override
    public Num numOf(final String number) {
        return DecimalNum.valueOf(number, this.mathContext);
    }

}
