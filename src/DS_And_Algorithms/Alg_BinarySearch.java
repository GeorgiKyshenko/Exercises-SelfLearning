package DS_And_Algorithms;


public class Alg_BinarySearch {
    public static void main(String[] args) {

        int[] array = new int[1000000];
        int target = 150000;

        /*For binary search arrays must always be sorted !*/
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }


//      int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.printf("Element found at index: %d", index);
        } else {
            System.out.printf("%d not found", target);
        }
    }

    private static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if (value < target) low = middle + 1;
            else if (value > target) high = middle - 1;
            else return middle;

        }
        return -1;
    }
}

