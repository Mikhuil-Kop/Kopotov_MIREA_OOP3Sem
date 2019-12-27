public class Dish implements Item{
    private final String name;
    private final String information;
    private final float price;

    public Dish(String name, String information, float price){
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
