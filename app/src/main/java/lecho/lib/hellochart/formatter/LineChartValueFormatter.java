package lecho.lib.hellochart.formatter;


import lecho.lib.hellochart.model.PointValue;

public interface LineChartValueFormatter {

    public int formatChartValue(char[] formattedValue, PointValue value);
}
