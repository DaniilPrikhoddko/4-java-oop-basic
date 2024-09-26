package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;
    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String ToString() {
        return '[' +p1.toString() + ", " + p2.toString() + ']';
    }

    public boolean isCollinearLine(Point p) {
        if (((p1.x <= p.x ) && (p.x <= p2.x)) || ((p1.x >= p.x ) && (p.x >= p2.x))) {
            if (((p1.y <= p.y ) && (p.y <= p2.y)) || ((p1.y >= p.y ) && (p.y >= p2.y)))  {
                double epsilon = 1e-10;
                if (Math.abs(((double) (p.x - p1.x) /(p2.x - p1.x)) - ((double) (p.y - p1.y) /(p2.y - p1.y))) <= epsilon) {
                    return true;
                }
                else return false;
            }
            else return false;
        }
        else return false;
    }
}
