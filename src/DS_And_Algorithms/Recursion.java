package DS_And_Algorithms;

public class Recursion {
    public static void main(String[] args) {

        System.out.println(factorial(10));
    }

    private static int factorial(int num) {
        if (num < 1) return 1;
        return num * factorial(num -1);
    }
}
