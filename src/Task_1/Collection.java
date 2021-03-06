package Task_1;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Collection implements Interface {
    ArrayList<Integer> newArrayList = new ArrayList<>();

    @Override
    public void addElement() {
        newArrayList.add(0, 20);
        newArrayList.add(1, 10);
        newArrayList.add(2, 30);
    }

    @Override
    public void addElementIndex(int index, int number) {
        newArrayList.add(index, number);
    }

    @Override
    public void removeElementIndex(int index) {
        newArrayList.remove(index);
    }

    @Override
    public void clearCollection() {
        newArrayList.clear();
    }

    @Override
    public int getLength() {
        return newArrayList.size();
    }

    @Override
    public boolean checkContent() {
        return newArrayList.contains(40);
    }

    @Override
    public void toArray() {
        int[] array = new int[newArrayList.size()];
        for (int a : newArrayList) {
            System.out.print(a + "; ");
        }
    }

    @Override
    public int getElementWithIndex(int index) {
        return newArrayList.get(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Collection that = (Collection) o;

        return newArrayList.equals(that.newArrayList);
    }

    @Override
    public int hashCode() {
        return newArrayList.hashCode();
    }

    @Override
    public String toString() {
        return "Collection{" +
                "newArrayList=" + newArrayList +
                '}';
    }
}