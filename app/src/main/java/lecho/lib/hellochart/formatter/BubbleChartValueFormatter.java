package lecho.lib.hellochart.formatter;

import lecho.lib.hellochart.model.BubbleValue;

public interface BubbleChartValueFormatter {

    public int formatChartValue(char[] formattedValue, BubbleValue value);
}
