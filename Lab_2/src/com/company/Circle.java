package com.company;
/*
Создать класс, описывающий модель окружности (Circle).
 В классе должны быть описаны нужные свойства
 окружности и методы для получения, изменения этих свойств.
 Протестировать работу класса в классе CircleTest,
 содержащим метод статический main(String[] args).
 */


public class Circle {
    private float radius, poxX, poxY;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = Math.abs(radius);
    }

    public float getPoxX() {
        return poxX;
    }

    public float getPoxY() {
        return poxY;
    }

    public void setPoxX(float poxX) {
        this.poxX = poxX;
    }

    public void setPoxY(float poxY) {
        this.poxY = poxY;
    }

    public void setPosition(float poxX, float poxY) {
        this.poxX = poxX;
        this.poxY = poxY;
    }
}
