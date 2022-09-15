package com.arv.learning.utils;

public class MathControllerUtils {
    public static Double convertToDouble(String value) {
        if (value == null) return 0D;
        String valueChecked = fixCurrency(value);
        if (isNumeric(valueChecked)) return Double.parseDouble(valueChecked);

        return 0D;
    }

    public static boolean isNumeric(String value) {
        if (value == null) return false;
        String valueChecked = fixCurrency(value);

        return valueChecked.matches("[+-]?[0-9]*\\.?[0-9]+");
    }

    public static String fixCurrency(String value) {
        return value.replaceAll(",", ".");
    }
}
