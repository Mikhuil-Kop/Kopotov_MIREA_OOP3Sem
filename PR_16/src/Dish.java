public final class Dish implements Item {
    private static final double zero = 0.0;
    private static final String zeroStr = "";
    private double cost;
    private final String name;
    private final String description;
    public Dish (String name, String description) {
        this.cost = zero;
        this.name = name;
        this.description = description;
    }
    public Dish (double cost, String name) {
        try {
            if (cost < 0 || name.isEmpty())
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        this.cost = cost;
        this.name = name;
        this.description = zeroStr;
    }
    public Dish (double cost, String name, String description) {
        try {
            if (cost < 0 || name.isEmpty() || description.isEmpty())
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        this.cost = cost;
        this.name = name;
        this.description = description;
    }
    public double getCost() {
        return cost;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String toString() {
        return name;
    }
    public void setCost (double cost) {
        this.cost = cost;
    }
}
