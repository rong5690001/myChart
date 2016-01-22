package lecho.lib.hellochart.formatter;

import lecho.lib.hellochart.model.SubcolumnValue;

public interface ColumnChartValueFormatter {

    public int formatChartValue(char[] formattedValue, SubcolumnValue value);

}
