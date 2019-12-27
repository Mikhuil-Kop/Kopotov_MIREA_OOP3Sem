package Dish;
import Food.*;

public class Bowl extends Dish {

    public void WarmFoodInSolarMicrowave(float temp) {
        food.Warm(temp);
        temperature += temp * 0.1;
    }

    public void Clean(float powerOfClearness) {
        purity += powerOfClearness * 2;
        if(purity > 1)
            purity = 1;
    }

    public String DishName() {
        return "Bowl";
    }
}
