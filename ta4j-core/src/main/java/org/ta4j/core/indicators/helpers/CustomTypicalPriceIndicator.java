package org.ta4j.core.indicators.helpers;

import org.ta4j.core.Bar;
import org.ta4j.core.BarSeries;
import org.ta4j.core.indicators.CachedIndicator;
import org.ta4j.core.num.Num;

public class CustomTypicalPriceIndicator extends CachedIndicator<Num> {
    protected final TypicalPriceTypeEnum typicalPriceType;

    /**
     * Constructor.
     *
     * @param series the bar series
     */
    public CustomTypicalPriceIndicator(BarSeries series, TypicalPriceTypeEnum typicalPriceType) {
        super(series);
        this.typicalPriceType = typicalPriceType != null ? typicalPriceType : TypicalPriceTypeEnum.OHLC;
    }

    @Override
    protected Num calculate(int index) {

        final Bar bar = getBarSeries().getBar(index);
        final Num openPrice = bar.getOpenPrice();
        final Num highPrice = bar.getHighPrice();
        final Num lowPrice = bar.getLowPrice();
        final Num closePrice = bar.getClosePrice();
        switch (typicalPriceType) {
            case OHLC -> {
                return openPrice.plus(highPrice).plus(lowPrice).plus(closePrice)
                        .dividedBy(getBarSeries().numFactory().four());
            }
            case HLCC -> {
                return highPrice.plus(lowPrice).plus(closePrice.multipliedBy(getBarSeries().numFactory().two()))
                        .dividedBy(getBarSeries().numFactory().four());
            }
            case HLC -> {
                return highPrice.plus(lowPrice).plus(closePrice).dividedBy(getBarSeries().numFactory().three());
            }
            default -> throw new IllegalArgumentException("Unsupported typical price type: " + typicalPriceType);
        }
    }

    /** @return {@code 0} */
    @Override
    public int getCountOfUnstableBars() {
        return 0;
    }
}
