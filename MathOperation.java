package com.interfaceandlambda;

@FunctionalInterface
interface IMathFunction {
    int calculate(int a, int b);
    static void showResult(int a, int b, String function, IMathFunction fnobj ) {
        System.out.println("Result of " + function + "is " + fnobj.calculate(a, b));
    }
}

public class MathOperation {
    public static void main(String[] args) {
        IMathFunction add = (x, y) -> x + y;
        IMathFunction subtract = (x, y) -> x - y;
        IMathFunction multiply = (x, y) -> x * y;
        IMathFunction divide = (x, y) -> x % y;

        System.out.println("Addtion is " + add.calculate(4, 9));
        System.out.println("Subtraction is " + subtract.calculate(7, 2));
        System.out.println("Multiplication is " + multiply.calculate(6, 8));
        System.out.println("Division is " + divide.calculate(3, 9));

        IMathFunction.showResult(2, 7, "Addition ", add);
        IMathFunction.showResult(9, 4, "Subtraction ", subtract);
        IMathFunction.showResult(6, 8, "Multiplication ", multiply);
        IMathFunction.showResult(2, 8, "Division ", divide);
    }
}
