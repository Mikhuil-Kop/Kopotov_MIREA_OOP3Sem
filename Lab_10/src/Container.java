public class Container<E> {
    private E[] array;
    private int iterator = -1;
    public Container(int numberOfElements){
        array = (E[]) new Object[numberOfElements];
    }

    public void add(E element){
        if(iterator >= array.length - 1)
            return;
        iterator++;
        array[iterator] = element;
    }

    public int getLength(){
        return array.length;
    }

    public E getElement(int index){
        return array[index];
    }
}

class Main{
    public static void main(String[] args) {
        Container<Integer> arrayOfIntegers = new Container<Integer>(5);
        for (int i = 0; i < arrayOfIntegers.getLength(); i++)
            arrayOfIntegers.add(i);
        Container arrayOfStrings = new Container<String>(5);
        for (int i = 0; i < arrayOfStrings.getLength(); i++)
            arrayOfStrings.add("element" + i);

        for (int i = 0; i < arrayOfIntegers.getLength(); i++){
            System.out.print(arrayOfIntegers.getElement(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayOfStrings.getLength(); i++){
            System.out.print(arrayOfStrings.getElement(i) + " ");
        }
        System.out.println();
        System.out.println("5-ый элемент массива строк: " + arrayOfStrings.getElement(4));
        System.out.println("3-ый элемент массива чисел: " + arrayOfIntegers.getElement(2));

    }
}
