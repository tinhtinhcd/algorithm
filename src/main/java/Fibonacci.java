public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(iterative(7));
    }

    public static int iterative(int n) {
        int minusOne = 0, minusTwo;
        int current = 1;

        if (n < 1)
            return n;

        for (int i = 1; i < n; i++) {
            minusTwo = minusOne;
            minusOne = current;
            current = minusOne + minusTwo;
        }

        return current;
    }
}
