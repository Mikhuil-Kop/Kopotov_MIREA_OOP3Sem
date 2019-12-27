package com.company_1;

public class rectangle extends Shape {
    protected double width;
    protected double length;
    public rectangle(){
        length = 12;
        width = 10;
        this.color = "green";
        this.filled = true;
    }
    public rectangle(double width, double length, String color, boolean filled ) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return "Прямоугольник, ширина: "+this.width+", высота"+this.length+", цвет: "+this.color;
    }
}
