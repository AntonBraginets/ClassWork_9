package Task_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Collection elements = new Collection();
        elements.addElement();//добавление трех элементов 10, 20, 30
        System.out.println("1) Creating collection:");
        for (int a : elements.newArrayList) {
            System.out.print(a + "; ");
        }
        elements.addElementIndex(2, 55); //добавление элемента 55 по индексу 2
        System.out.println();
        System.out.println("2) Added item (55, index 2) into collection:");
        for (int a : elements.newArrayList) {
            System.out.print(a + "; ");
        }
        elements.removeElementIndex(1); //удаляем элемент по индексу 1
        System.out.println();
        System.out.println("3) Deleted item (20, index 1) from collection:");
        for (int a : elements.newArrayList) {
            System.out.print(a + "; ");
        }
        elements.clearCollection();
        System.out.println();
        System.out.println("4) Collection was cleared.");
        for (int a : elements.newArrayList) {
            System.out.print(a + "; ");
        }
        elements.addElement();//создаем коллекцию заново
        System.out.print("5) This collection consists of " + elements.getLength() + " elements.");
        System.out.println();
        if (elements.checkContent()) System.out.println("6) This collection contains item 40.");
        else System.out.println("6) This collection doesn't contain item 40.");
        System.out.println("7) Collection to Array array[]:");
        elements.toArray();
        System.out.println();
        System.out.println("8) Element with index 1: " + elements.getElementWithIndex(1));

    }
}