package DS_And_Algorithms.DS_Custom_DynamicArray;

public class DynamicArray {

    private int size;
    private int capacity;
    private Object[] array;

    public DynamicArray() {
        this.capacity = 10;
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void add(int index, Object data) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;

    }

    public void remove(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if (size <= capacity / 3) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {

        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {

        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {
        int newCapacity = capacity / 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int length() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();

        string.append("[");

        for (int i = 0; i < size; i++) {
            string.append(array[i]).append(", ");
        }
        if (!string.isEmpty()) {
            if (string.substring(string.length() - 2, string.length()).equals(", ")) {
                string.replace(string.length() - 2, string.length(), "");
            }
        }
        string.append("]");
        return string.toString();
    }

}
