import java.util.ArrayList;
import java.util.HashMap;

public class OrderManager {
    private HashMap<String, InternetOrder> addressOrder = new HashMap<>();

    public void add(String address, InternetOrder order){
        addressOrder.put(address, order);
    }

    public InternetOrder get(String address){
        return addressOrder.get(address);
    }

    public void getOrders() {
        ArrayList<InternetOrder> fullOrder = new ArrayList<>(addressOrder.values());
        System.out.println("Заказы: ");
        for (int i = 0; i < fullOrder.size(); i++){
            System.out.println("Заказ №" + (i + 1));
            fullOrder.get(i).allNames();
            System.out.println();
        }
        System.out.println();
    }

    public float summaryPrice(){
        float sum = 0;
        ArrayList<InternetOrder> fullOrder = new ArrayList<>(addressOrder.values());
        for(int i = 0; i < fullOrder.size(); i++){
            sum += fullOrder.get(i).summaryPrice();
        }
        return sum;
    }
}
