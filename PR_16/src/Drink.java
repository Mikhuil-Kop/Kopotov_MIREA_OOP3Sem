public final class Drink implements Item {
    private static final double zero = 0.0;
    private static final String zeroStr = "";
    private double cost;
    private final String name;
    private final String description;

    public Drink (String name, String description) {
        try {
            if (name.isEmpty() || description.isEmpty())
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        this.cost = zero;
        this.name = name;
        this.description = description;
    }

    public Drink (double cost, String name) {
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

    public Drink (double cost, String name, String description) {
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

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toString() {
        return name;
    }
}
