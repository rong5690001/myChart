package lecho.lib.hellochart.formatter;

import lecho.lib.hellochart.model.SliceValue;

public interface PieChartValueFormatter {

    public int formatChartValue(char[] formattedValue, SliceValue value);
}
