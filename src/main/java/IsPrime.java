public class IsPrime {
    public static void main(String[] args) {
       for (int i = 0 ; i < 20; i ++){
           System.out.println(i+ " is prime "+ isPrime(i));
       }
    }

    public static boolean isPrime(int n) {
        if (n == 0)
            return false;
        if (n == 1)
            return true;
        int k = n / 2;
        while (k > 1) {
            if (n % k == 0)
                return false;
            k--;
        }
        return true;
    }
}
