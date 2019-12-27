import java.lang.reflect.Array;

public class CycleDoubleLinkedList<T> {
    private final DoubleNode<T> head;

    public CycleDoubleLinkedList() {
        head = new DoubleNode<>();
        head.setNext(head);
        head.setPrev(head);
    }

    public void create(T[] values) {
        DoubleNode<T> newNode;
        for ( int i = 0; i < values.length; i++ ) {
            newNode = new DoubleNode<>( values[i], head, head.getPrev() );
            head.getPrev().setNext(newNode);
            head.setPrev(newNode);
        }
    }

    public boolean insertAfter (DoubleNode<T> nodeBeforeNew, T value) {
        DoubleNode<T> newNode;
        if ( nodeBeforeNew != null ) {
            newNode = new DoubleNode<>(value, nodeBeforeNew.getNext(), nodeBeforeNew);
            newNode.getNext().setPrev(newNode);
            nodeBeforeNew.setNext(newNode);
            return true;
        } else
            return false;
    }

    public DoubleNode<T> search (DoubleNode<T> node, String str) {
        while (node != head) {
            if (node.getValue().toString().equals(str))
                return node;
            node = node.getNext();
        }
        return null;
    }

    public DoubleNode<T> search(String str) {
        if ( head != null ) {
            DoubleNode<T> node = head.getNext();
            while (node != head) {
                if (node.getValue().toString().equals(str))
                    return node;
                node = node.getNext();
            }
        }
        return null;
    }

    public boolean delete (DoubleNode<T> node) {
        if (head != null && head.getNext() != head && head.getPrev() != head && node != null) {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
            return true;
        } else
            return false;
    }

    public int size() {
        int size = 0;
        if ( head != null ) {
            DoubleNode<T> p = head.getNext();
            while (p != head) {
                size++;
                p = p.getNext();
            }
        }
        return size;
    }

    public T[] getArray (Class<?> componentType) {
        T[] orderItems = (T[]) Array.newInstance(componentType, size());
        if ( head != null ) {
            DoubleNode<T> p = head.getNext();
            for (int i = 0; i < size() && p != head; i++) {
                orderItems[i] = p.getValue();
                p = p.getNext();
            }
        }
        return orderItems;
    }

    public void show() {
        if ( head != null ) {
            DoubleNode<T> node = head.getNext();
            while (node != head) {
                System.out.print(node.getValue().toString() + " ");
                node = node.getNext();
            }
        }
    }

    public DoubleNode<T> getHead () {
        return head;
    }
}
