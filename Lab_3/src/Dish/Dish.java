package Dish;
import Food.*;

public abstract class Dish {
    protected float purity;
    protected float temperature;
    protected Food food;

    public boolean PutFood(Food food){
        if(this.food == null) {
            this.food = food;
            return true;
        }else
            return false;
    }

    public Food LookAtFood() {
        return food;
    }

    public Food TakeFood(){
        Food a = food;
        food = null;
        return a;
    }

    public float getPurity() {
        return purity;
    }

    public float getTemperature() {
        return temperature;
    }

    public abstract void WarmFoodInSolarMicrowave(float temp);

    public abstract void Clean(float powerOfClearness);

    public abstract String DishName();
}
