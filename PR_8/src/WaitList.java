import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> waitList;

    public WaitList() {
        waitList = new ConcurrentLinkedQueue<E>();
    }

    public WaitList(Collection<E> collection) {
        waitList = (ConcurrentLinkedQueue<E>) collection;
    }

    public void add(E element) {
        waitList.add(element);
    }

    public E remove() {

        return waitList.remove();
    }

    public boolean contains(E element) {
        for (E unit : waitList) {
            if (unit == element)
                return true;
        }
        return false;
    }

    public boolean containsAll(Collection<E> collection) {
        int counter = 0;
        ConcurrentLinkedQueue<E> tempWaitList = waitList;
        for (E element : collection) {
            for (E unit : tempWaitList) {
                if (element == unit) counter++;
            }
            if (counter == 0) return false;
            counter = 0;
        }
        return true;
    }

    public boolean isEmpty() {
        if (waitList.size() == 0)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        String s = "";
        for (E element : waitList)
            s += element + " ";
        return s;
    }
}
