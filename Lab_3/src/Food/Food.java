package Food;

public class Food {
    private String name;
    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Warm(float temperature) {
        this.temperature += temperature;
    }
}
