package com.example.task03;

public class ComplexNumber {
    private final double realPart;
    private final double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber Add(ComplexNumber num) {
        double newRealPart = num.realPart + this.realPart;
        double newImaginaryPart = num.imaginaryPart + this.imaginaryPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber Multiply(ComplexNumber num) {
        double newRealPart = num.realPart * this.realPart - num.imaginaryPart * this.imaginaryPart;
        double newImaginaryPart = this.realPart*num.imaginaryPart + num.realPart*this.imaginaryPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}
