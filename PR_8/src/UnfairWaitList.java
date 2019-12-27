import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {

    UnfairWaitList(){
        waitList = new ConcurrentLinkedQueue<>();
    }

    void moveToBack(){
        add(remove());
    }
}
