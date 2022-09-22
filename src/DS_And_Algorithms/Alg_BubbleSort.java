package DS_And_Algorithms;

public class Alg_BubbleSort {
    public static void main(String[] args) {

        int[] array = {2, 5, 1, 7, 9, 3, 4, 6, 8};

        bubbleSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) { /*for descending order we need to switch `>` to `<` */
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
