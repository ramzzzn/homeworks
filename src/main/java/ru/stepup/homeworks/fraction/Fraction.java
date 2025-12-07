package ru.stepup.homeworks.fraction;

public class Fraction extends Number{
    final int num;
    final int denum;

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Неверное значение знаменателя");
        }
        this.num = numerator;
        this.denum = denominator;
    }

    private int nod(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int nok(int a, int b) {
        return Math.abs(a * b) / nod(a, b);
    }


    private Fraction performOperation(Fraction f, int operation) {
        int nok = nok(this.denum, f.denum);
        int num1 = this.num * (nok / this.denum);
        int num2 = f.num * (nok / f.denum);
        int resultNumerator = operation == 1 ? num1 + num2 : num1 - num2;
        return new Fraction(resultNumerator, nok);
    }

    public Fraction sum(Fraction f) {
        return performOperation(f, 1);
    }

    public Fraction minus(Fraction f) {
        return performOperation(f, -1);
    }

    public Fraction sum(int number) {
        Fraction numberAsFraction = new Fraction(number, 1);
        return this.sum(numberAsFraction);
    }

    public Fraction minus(int number) {
        Fraction numberAsFraction = new Fraction(number, 1);
        return this.minus(numberAsFraction);
    }

    @Override
    public String toString() {
        return num + "/" + denum;
    }

    @Override
    public int intValue() {
        return num / denum;
    }

    @Override
    public long longValue() {
        return num / denum;
    }

    @Override
    public float floatValue() {
        return (float) num / denum;
    }

    @Override
    public double doubleValue() {
        return (double) num / denum;
    }
}
