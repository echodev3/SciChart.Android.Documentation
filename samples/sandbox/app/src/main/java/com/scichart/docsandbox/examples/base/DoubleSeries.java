//******************************************************************************
// SCICHART® Copyright SciChart Ltd. 2011-2017. All rights reserved.
//
// Web: http://www.scichart.com
// Support: support@scichart.com
// Sales:   sales@scichart.com
//
// DoubleSeries.java is part of the SCICHART® Examples. Permission is hereby granted
// to modify, create derivative works, distribute and publish any part of this source
// code whether for commercial, private or personal use.
//
// The SCICHART® examples are distributed in the hope that they will be useful, but
// without any warranty. It is provided "AS IS" without warranty of any kind, either
// expressed or implied.
//******************************************************************************

package com.scichart.docsandbox.examples.base;

import com.scichart.core.model.DoubleValues;

public class DoubleSeries {

    public final DoubleValues xValues;
    public final DoubleValues yValues;

    public DoubleSeries(int capacity){
        xValues = new DoubleValues(capacity);
        yValues = new DoubleValues(capacity);
    }

    public void add(double x, double y){
        xValues.add(x);
        yValues.add(y);
    }
}
