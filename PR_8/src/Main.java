import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WaitList waitList = new WaitList();
        waitList.add(1);
        waitList.add(2);
        waitList.add(3);
        waitList.add(4);
        System.out.println(waitList);
        System.out.println("Удалим: " + waitList.remove());
        System.out.println("Элемент 1 найден: " + waitList.contains(1));
        System.out.println("Очередь пуста: " + waitList.isEmpty());

        ArrayList<Integer> str = new ArrayList<Integer>();
        str.add(1);
        str.add(2);
        str.add(3);

        System.out.println("Очередь включает в себя все элементы коллекции: " + waitList.containsAll(str));

        System.out.println("-----------------------------------------");

        BoundedWaitList boundedWaitList = new BoundedWaitList(5);
        System.out.println("Вместимость: " + boundedWaitList.getCapacity());
        boundedWaitList.add(11);
        boundedWaitList.add(22);
        boundedWaitList.add(33);
        boundedWaitList.add(44);
        boundedWaitList.add(55);
        System.out.println(boundedWaitList);
        boundedWaitList.add(6);

        System.out.println("-----------------------------------------");

        UnfairWaitList unfairWaitList = new UnfairWaitList();
        unfairWaitList.add(8);
        unfairWaitList.add(7);
        unfairWaitList.add(9);
        System.out.print("Очередь до перестановки: ");
        System.out.println(unfairWaitList);
        unfairWaitList.moveToBack();
        System.out.print("Очередь после перестановки: ");
        System.out.println(unfairWaitList);
    }
}
