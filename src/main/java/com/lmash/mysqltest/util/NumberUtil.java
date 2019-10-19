package com.lmash.mysqltest.util;

public class NumberUtil {

    public static boolean isNumber(String number) {
        if (number == null || "".equals(number)) {
            return false;
        }

        String regularExpression = "[A-Za-z0-9]{6}";
        boolean matches = number.matches(regularExpression);

        return matches;
    }
}