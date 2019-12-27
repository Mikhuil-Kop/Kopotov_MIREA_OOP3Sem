public class RestaurantOrder implements Order {

    private CycleDoubleLinkedList<Item> items;

    public RestaurantOrder() {
        items = new CycleDoubleLinkedList<>();
    }

    public RestaurantOrder(Item[] itemsArray) {
        items = new CycleDoubleLinkedList<>();
        items.create(itemsArray);
    }

    public void show() {
        items.show();
        System.out.print("\n");
    }

    public boolean add(Item item) {
        return items.insertAfter(items.getHead().getPrev(), item);
    }

    public boolean remove(String itemName) {
        return items.delete(items.search(itemName));
    }

    public int removeAll(String itemName) {
        int deleteCounter = 0;
        boolean isContinue = true;
        while (isContinue) {
            isContinue = items.delete(items.search(itemName));
            if (isContinue)
                deleteCounter++;
        }
        return deleteCounter;
    }

    public int size() {
        return items.size();
    }

    public Item[] getItemsArray () {
        return items.getArray(Item.class);
    }

    public double costTotal() {
        double commonCost = 0;
        Item[] arr = items.getArray(Item.class);
        for (int i = 0; i < items.size(); i++)
            commonCost = commonCost + arr[i].getCost();
        return commonCost;
    }

    public int itemQuantity(String itemName) {
        int itemCounter = 0;
        DoubleNode<Item> node;
        if (items.getHead() != null)
            node = items.getHead().getNext();
        else
            return itemCounter;
        while (node != null) {
            node = items.search(node, itemName);
            if (node != null)
                itemCounter++;
        }
        return itemCounter;
    }

    public String[] itemsNames() {
        Item [] arrItems = items.getArray(Item.class);
        String [] arrNames= new String[items.size()];
        for (int i = 0; i < items.size(); i++) {
            if (isNew(arrItems[i].getName(), arrNames)) {
                arrNames[i] = arrItems[i].getName();
            }
        }
        return arrNames;
    }

    private boolean isNew (String itemName, String [] arrNames) {
        for (int i = 0; i < items.size() && arrNames[i] != null; i++) {
            if (arrNames[i].equals(itemName))
                return false;
        }
        return true;
    }

    public Item[] sortedItemsByCost () {
        Item [] arrSortItems = items.getArray(Item.class);
        for (int out = items.size() - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if(arrSortItems[in].getCost() > arrSortItems[in + 1].getCost()) {
                    double buf = arrSortItems[in].getCost();
                    arrSortItems[in].setCost(arrSortItems[in + 1].getCost());
                    arrSortItems[in + 1].setCost(buf);
                }
            }
        }
        return arrSortItems;
    }
}
