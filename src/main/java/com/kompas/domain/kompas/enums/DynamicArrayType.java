package com.kompas.domain.kompas.enums;

/**
 * Created by Sergej Povzanyuk on 09.08.2016.
 */
public enum DynamicArrayType {
    CHAR_STR_ARR(1),
    POINT_ARR(2),
    CURVE_PATTERN_ARR(2),
    TEXT_LINE_ARR(3),
    TEXT_ITEM_ARR(4),
    ATTR_COLUMN_ARR(5),;


    private int arrayType;

    DynamicArrayType(int arrayType) {
        this.arrayType = arrayType;
    }

    public int getNumber() {
        return arrayType;
    }
}
