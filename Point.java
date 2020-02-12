package com.company;

class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(new Point(0, 0));
    }

    public double distance(int x, int y) {
        return distance(new Point(x, y));
    }

    public double distance(Point another) {
        return Math.sqrt((another.getX() - this.x) * (another.getX() - this.x)
                + (another.getY() - this.y) * (another.getY() - this.y));
    }
}

public class Main {

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0, 0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2, 2) = " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance() = " + point.distance());
    }
}