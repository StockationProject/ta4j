/*
 * SPDX-License-Identifier: MIT
 */
package org.ta4j.core.num;

import java.io.Serializable;

public interface NumFactory extends Serializable {

    /**
     * @return the Num of -1
     */
    Num minusOne();

    /**
     * @return the Num of 0
     */
    Num zero();

    /**
     * @return the Num of 1
     */
    Num one();

    /**
     * @return the Num of 2
     */
    Num two();

    /**
     * @return the Num of 3
     */
    Num three();

    Num four();

    /**
     * @return the Num of 10
     */
    Num ten();

    /**
     * @return the Num of 20
     */
    Num twenty();

    /**
     * @return the Num of 30
     */
    Num thirty();

    /**
     * @return the Num of 40
     */
    Num forty();

    /**
     * @return the Num of 50
     */
    Num fifty();

    /**
     * @return the Num of 60
     */
    Num sixty();

    /**
     * @return the Num of 70
     */
    Num seventy();

    /**
     * @return the Num of 80
     */
    Num eighty();

    /**
     * @return the Num of 90
     */
    Num ninety();

    /**
     * @return the Num of 100
     */
    Num hundred();

    /**
     * @return the Num of 100
     */
    Num thousand();

    /**
     * Transforms a {@link Number} into the {@link Num implementation} used by this
     * bar series
     *
     * @param number a {@link Number} implementing object.
     * @return the corresponding value as a Num implementing object
     */
    Num numOf(Number number);

    /**
     * Transforms a {@link Number} into the {@link Num implementation} used by this
     * bar series
     *
     * @param number as string
     * @return the corresponding value as a Num implementing object
     */
    Num numOf(String number);

    /**
     * Determines whether num instance has been produced by this factory
     *
     * @param num to test
     * @return true if made by this factory
     */
    default boolean produces(final Num num) {
        return num == null || one().getClass() == num.getClass() || num.equals(NaN.NaN);
    }
}
