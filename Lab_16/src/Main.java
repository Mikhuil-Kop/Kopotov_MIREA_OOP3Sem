public class Main {
    public static void main(String[] args){
        Dish burger = new Dish("Бургер", "Говядина, салат, помидоры, соус, булочки, сыр", 250);
        Dish salad = new Dish("Цезарь", "курица, салат, сухари, помидоры, соус", 150);
        Drink drink = new Drink("Кока Кола","Вода, регуляторы кислотности, подсластители, ароматизаторы", 80);
        Dish potato = new Dish("Картошка Фри", "Картошка, масло", 60);

        InternetOrder example1 = new InternetOrder();
        example1.add(burger);
        example1.add(salad);
        example1.add(drink);


        System.out.println(example1.getPosition("Цезарь"));
        example1.remove("Цезарь");


        InternetOrder example2 = new InternetOrder();
        example2.add(drink);
        example2.add(potato);


        OrderManager order = new OrderManager();
        order.add("Moscow, Malaya Pirogovskaya, 2", example1);
        order.add("Moscow, Moscovskaya, 45", example2);
        System.out.println("Общая цена заказа по адресу Moscow, Malaya Pirogovskaya, 2: " + order.get("Moscow, Malaya Pirogovskaya, 2").summaryPrice() + " рублей");
        System.out.println("Общая цена заказа по адресу Moscow, Moscovskaya, 45: " + order.get("Moscow, Moscovskaya, 45").summaryPrice() + " рублей");
        order.getOrders();
        System.out.println("Checkout: " + order.summaryPrice());
        System.out.println("First order:");
        order.get("Moscow, Malaya Pirogovskaya, 2").allNames();
    }
}
