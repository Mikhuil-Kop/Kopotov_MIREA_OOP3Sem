package com.company_2;

public class MovableRectangle implements Movable {
    MovablePoint point1 = new MovablePoint(1, 1, 1, 1);
    MovablePoint point2 = new MovablePoint(0, 0, 1, 1);

    public MovableRectangle(){
        point1 = new MovablePoint(1, 1, 1, 1);
        point2 = new MovablePoint(0, 0, 1, 1);
    }

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        point1 = new MovablePoint(x1, y1, xSpeed, ySpeed);
        point2 = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        point1.moveUp();
        point2.moveUp();
    }

    @Override
    public void moveDown() {
        point1.moveDown();
        point2.moveDown();
    }

    @Override
    public void moveLeft() {
        point1.moveLeft();
        point2.moveLeft();
    }

    @Override
    public void moveRight() {
        point1.moveRight();
        point2.moveRight();
    }

    @Override
    public String toString() {
        return String.format("Квадрат определяемый точками: (" + point1 + ", " + point2 + ")");
    }
}
