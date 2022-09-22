package DS_And_Algorithms;

public class Alg_InterpolationSearch {

    public static void main(String[] args) {

        int[] array = new int[9];
        int target = 8;

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int index = interpolationSearch(array, target);


        if (index != -1) {
            System.out.printf("Element found at index: %d", index);
        } else {
            System.out.printf("%d not found", target);
        }
    }

    private static int interpolationSearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (target >= array[low] && target <= array[high] && low <= high) {

            int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);

            System.out.println("probe: " + probe);

            if (array[probe] == target) {
                return probe;
            } else if (array[probe] < target) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
}
