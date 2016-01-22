package lecho.lib.hellochart.listener;


import lecho.lib.hellochart.model.SliceValue;

public interface PieChartOnValueSelectListener extends OnValueDeselectListener {

    public void onValueSelected(int arcIndex, SliceValue value);

}
