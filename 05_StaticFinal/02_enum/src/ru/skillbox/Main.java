package ru.skillbox;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(Operation.ADD);
        calculator.calculate(Operation.ADD, 2,3);
        calculator.calculate(Operation.SUBTRACT, 2,3);
        calculator.calculate(Operation.MULTIPLY, 2,3);
    }
}
