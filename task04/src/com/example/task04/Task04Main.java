package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 4);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(3, 3);
        Point p5 = new Point(2, 3);

        Line line = new Line(p1, p2);

        System.out.println("p3 лежит на прямой: " + line.isCollinearLine(p3)); // true
        System.out.println("p4 лежит на прямой: " + line.isCollinearLine(p4)); // true
        System.out.println("p5 лежит на прямой: " + line.isCollinearLine(p5)); // false
    }
}
