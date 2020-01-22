public class GCD {
    public static void main(String[] args) {
        System.out.println(GCD(11,55));
    }

    public static int GCD(int n, int m) {
        int smaller = n < m ? n : m;
        for (int i = smaller; i > 0; i--) {
            if (n % i == 0 && m % i == 0)
                return i;
        }
        return 1;
    }
}
