package ru.courses.main;

import java.util.List;

public class Sum {
    List<String> input;

    public Sum(List<String> input) {
        this.input = input;
    }

    public double sum() {
        double result = 0;
        for (String number : input) {
            if (!isNumeric(number)) {
                continue;
            }
            result += Double.parseDouble(number);
        }
        return result;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        int startIndx = 0;
        boolean isFraction = false;
        if (strNum.startsWith("-")) {
            startIndx = 1;
        }
        for (int i = startIndx; i < strNum.length(); i++) {
            if (!isFraction && strNum.charAt(i) == '.') {
                isFraction = true;
                continue;
            }
            if (!Character.isDigit(strNum.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Sum inputList = new Sum(List.of(args));
        System.out.println(inputList.sum());
    }
}
