public class Main {
    public static void main(String[] args) {
        InternetOrder order = new InternetOrder(new Item[] {
                new Dish(700, "Мясо"),
                new Dish(400, "Трава"),
                new Drink(300, "Сок"),
                new Drink(100, "Водка")
        });
        order.show();

        Item [] itemsOrder = order.getItemsArray();
        for (int i = 0; i < order.size(); i++)
            System.out.println(i + ")" + itemsOrder[i] + " ");
        System.out.println("Сумма заказа:"+ order.costTotal());
    }
}
