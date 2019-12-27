import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    BoundedWaitList(int capacity) {
        waitList = new ConcurrentLinkedQueue<>();
        this.capacity = capacity;
    }

    int getCapacity() {
        return capacity;
    }

    boolean isFull() {
        return waitList.size() == capacity;
    }

    @Override
    public void add(E element) {
        if (!isFull())
            waitList.add(element);
        else
            System.out.println("Список заполнен. Добавление элемента невозможно.");
    }


}
