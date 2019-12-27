import java.util.HashMap;

public class OrderManager {

    private HashMap<Integer, Order> restaurantOrders = new HashMap<>();
    private HashMap<String, Order> internetOrders = new HashMap<>();

    public void add(int tableNumber, Order order) {
        checkOrderIsNew(tableNumber);
        restaurantOrders.put(tableNumber, order);
    }
    
    public void add(String address, Order order) {
        checkOrderIsNew(address);
        internetOrders.put(address, order);
    }
    
    public Order getOrder(int tableNumber) {
        checkOrderExist(tableNumber);
        return restaurantOrders.get(tableNumber);
    }
    
    public Order getOrder(String address) {
        checkOrderExist(address);
        return internetOrders.get(address);
    }
    
    public void addItem(int tableNumber, Item item) {
        checkOrderExist(tableNumber);
        restaurantOrders.get(tableNumber).add(item);
    }
    
    public void addItem(String address, Item item) {
        checkOrderExist(address);
        internetOrders.get(address).add(item);
    }
    
    public void removeOrder(int tableNumber) {
        checkOrderExist(tableNumber);
        restaurantOrders.remove(tableNumber);
    }
    
    public void removeOrder(String address) {
        checkOrderExist(address);
        internetOrders.remove(address);
    }

    public Order [] getOrders() {
        return internetOrders.values().toArray(new Order[internetOrders.values().size()]);
    }
    public double ordersCostSummary() {
        double summaryCost = 0;
        Order [] orders = getOrders();
        for (int i = 0; i < orders.length; i++)
            summaryCost = summaryCost + orders[i].costTotal();
        return summaryCost;
    }
    
    public int itemQuantity(String itemName) {
        int itemQuantity = 0;
        Order [] orders = getOrders();
        for (int i = 0; i < orders.length; i++)
            itemQuantity = itemQuantity + orders[i].itemQuantity(itemName);
        return itemQuantity;
    }
    
    private void checkOrderExist(int tableNumber) {
        try {
            if (!restaurantOrders.containsKey(tableNumber))
                throw new IllegalTableNumber("Заказа для этого столика не существует");
        } catch (IllegalTableNumber e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void checkOrderExist(String address) {
        try {
            if (!internetOrders.containsKey(address))
                throw new IllegalTableNumber("Для указанного адреса не существует заказа");
        } catch (IllegalTableNumber e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void checkOrderIsNew(int tableNumber) {
        try {
            if (restaurantOrders.containsKey(tableNumber)) {
                throw new OrderAlreadyAddedException("Для указанного столика уже существует заказ.");
            }
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }
    }

    private void checkOrderIsNew(String address) {
        try {
            if (internetOrders.containsKey(address)) {
                throw new OrderAlreadyAddedException("Для указанного адреса уже существует заказ.");
            }
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }
    }
}
