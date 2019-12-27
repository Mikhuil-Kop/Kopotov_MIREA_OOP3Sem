public class DoubleNode<T> {
    private T value;
    private DoubleNode<T> next;
    private DoubleNode<T> prev;
    public DoubleNode(){}
    public DoubleNode(T value) {
        this.value = value;
    }
    public DoubleNode(T value, DoubleNode<T> next, DoubleNode<T> prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
    public void setNext (DoubleNode<T> next) {
        this.next = next;
    }
    public void setPrev (DoubleNode<T> prev) {
        this.prev = prev;
    }
    public DoubleNode<T> getNext () {
        return next;
    }
    public DoubleNode<T> getPrev () {
        return prev;
    }
    public T getValue () {
        return value;
    }
}
