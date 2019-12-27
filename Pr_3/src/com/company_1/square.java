package com.company_1;

public class square extends rectangle {
    public square() {
        filled = true;
        color = "yellow";
        width = 6;
        length = 6;
    }

    public square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        width = side;
        length = side;
    }

    public square(double side) {
        length = side;
        width = side;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        length = side;
        width = side;
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return "Квадрат, ширина: "+this.width+", "+this.length+", color: "+this.color;
    }
}
