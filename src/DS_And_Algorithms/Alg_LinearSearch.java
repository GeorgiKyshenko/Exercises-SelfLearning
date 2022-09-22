package DS_And_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Alg_LinearSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int value = Integer.parseInt(scanner.nextLine());

        int index = linearSearch(numbers, value);

        if (index != -1) {
            System.out.printf("Element found at index: %d", index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] numbers, int value) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
