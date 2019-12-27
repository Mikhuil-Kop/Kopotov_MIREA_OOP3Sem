package com.company_1;

public class circle extends Shape {
    protected double radius;

    public circle() {
        this.filled = false;
        this.color = "blue";
        radius = 1;
    }

    public circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public circle(double radius) {
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Круг, радиус: "+this.radius+", цвет: "+this.color;
    }
}
