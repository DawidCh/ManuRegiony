package com.chojnacki.manufaktura.manuregiony.model;

/**
 * Coordinate holder
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(x = " + x + " y = " + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
