package ru.skillbox;

public class ArithmeticCalculator {
    public double num1;
    public double num2;

    public ArithmeticCalculator(Operation operation, double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public Operation operation;

    public Operation getOperation() {

        return operation;
    }

    public double calculate(Operation operation) {

        switch (operation) {
            case ADD:
                return num1 + num2;

            case SUBTRACT:
                return num1 - num2;

            case MULTIPLY:
                return num1 * num2;

            default:
                return - 1;
        }
    }
}


