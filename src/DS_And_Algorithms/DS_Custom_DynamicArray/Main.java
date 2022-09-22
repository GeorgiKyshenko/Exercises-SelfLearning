package DS_And_Algorithms.DS_Custom_DynamicArray;


public class Main {
    public static void main(String[] args) {


        /*Usually this DynamicArray is equal to = List<String> list = new ArrayList<>(); */
        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");

        dynamicArray.add(1,"3");

        dynamicArray.remove("B");

        System.out.println(dynamicArray.search("B"));
        System.out.println(dynamicArray.search("3"));
        System.out.println(dynamicArray.getCapacity());

        System.out.println(dynamicArray);




    }
}
