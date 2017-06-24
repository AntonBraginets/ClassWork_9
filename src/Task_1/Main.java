package Task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Collection col1 = new Collection();
        Collection col2 = new Collection();

        //добавление трех элементов 10, 20, 30 в коллекцию col1
        col1.addElement();
        System.out.println("1) Creating collection (col1):");
        for (int a : col1.newArrayList) {
            System.out.print(a + "; ");
        }
        //добавление трех элементов 10, 20, 30 в коллекцию col2
        col2.addElement();

        //добавление элемента 55 по индексу 2
        col1.addElementIndex(2, 55);
        System.out.println();
        System.out.println("2) Added item (55, index 2) into collection:");
        for (int a : col1.newArrayList) {
            System.out.print(a + "; ");
        }

        //удаляем элемент по индексу 1
        col1.removeElementIndex(1);
        System.out.println();
        System.out.println("3) Deleted item (20, index 1) from collection:");
        for (int a : col1.newArrayList) {
            System.out.print(a + "; ");
        }

        //очищаем коллекцию
        col1.clearCollection();
        System.out.println();
        System.out.println("4) Collection was cleared.");
        for (int a : col1.newArrayList) {
            System.out.print(a + "; ");
        }

        //создаем коллекцию заново
        col1.addElement();
        System.out.print("5) This collection consists of " +
                col1.getLength() + " elements.");
        System.out.println();
        if (col1.checkContent())
            System.out.println("6) This collection contains item 40.");
        else
            System.out.println("6) This collection doesn't contain item 40.");

        //Коллекцию в массив
        System.out.println("7) Collection to Array array[]:");
        col1.toArray();
        System.out.println();

        //Получаем элемент с индексом 1
        System.out.println("8) Element with index 1: " +
                col1.getElementWithIndex(1));

        //Первое вхождение числа 20
        System.out.print("9) Figure 20 was met for the " +
                "first time with index of: ");
        System.out.println(col1.newArrayList.indexOf(20));

        //Последнее вхождение числа 10
        System.out.print("10) Figure 10 was met for the " +
                "last time with index of: ");
        System.out.println(col1.newArrayList.lastIndexOf(10));

        //Сравнение объектов Col1 и Col2
        System.out.print("11) Equals method in action. Col1 equals to Col2: ");
        System.out.println(col1.equals(col2));

        //Использование метода toString
        System.out.print("12) toString method in action: ");
        System.out.println(col1.toString());
        System.out.println(col2.toString());
    }
}