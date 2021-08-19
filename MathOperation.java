package com.interfaceandlambda;

@FunctionalInterface
interface IMathFunction {
    int calculate(int a, int b);
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
    }
}
