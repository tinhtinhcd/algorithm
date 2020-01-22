public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
            sum += arr[i];

        }

        System.out.println((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) {
        int[] arr = {256741038, 623958417, 467905213, 714532089, 938071625};
        miniMaxSum(arr);
    }
}