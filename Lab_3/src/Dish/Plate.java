package Dish;
import Food.*;

public class Plate extends Dish {

    public void WarmFoodInSolarMicrowave(float temp) {
        food.Warm(temp * 0.5f);
        temperature += temp * 0.5;
    }

    public void Clean(float powerOfClearness) {
        purity += powerOfClearness;
        if (purity > 1)
            purity = 1;
    }

    public String DishName() {
        return "Plate";
    }
}
