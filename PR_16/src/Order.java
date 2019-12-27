public interface Order {
    boolean add(Item item);
    boolean remove(String itemName);
    int removeAll(String itemName);
    int size();
    Item[] getItemsArray ();
    double costTotal();
    int itemQuantity(String itemName);
    String[] itemsNames();
    Item[] sortedItemsByCost ();
}
