package com.company;

public class Ball {
    private double x = 0, y = 0;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public  Ball(){
        x = 0;
        y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void Move(double x, double y){
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "Ball @ (" + x + "; " + y + ")";
    }
}
