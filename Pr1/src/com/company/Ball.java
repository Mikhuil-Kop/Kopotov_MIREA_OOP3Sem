package com.company;

public class Ball {
    private float weigth;

    public Ball(int weigth){this.weigth = weigth;}
    public Ball(){weigth = 0.1f;}

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Мячь весом в " + weigth;
    }
}
