public class Drink implements Item {
    private final String name;
    private final String information;
    private final float price;

    public Drink(String name, String information){
        this.name = name;
        this.information = information;
        this.price = 0;
    }

    public Drink(String name, String information, float price){
        this.name = name;
        this.information = information;
        this.price = price;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getInformation(){
        return information;
    }

    @Override
    public float getPrice(){
        return price;
    }
}
