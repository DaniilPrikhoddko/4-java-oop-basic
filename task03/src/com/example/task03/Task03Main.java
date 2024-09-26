package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(1, 2);
        ComplexNumber num2 = new ComplexNumber(3, 4);

        ComplexNumber sum = num1.Add(num2);
        System.out.println("Сумма: " + sum);

        ComplexNumber product = num1.Multiply(num2);
        System.out.println("Произведение: " + product);
    }
}
