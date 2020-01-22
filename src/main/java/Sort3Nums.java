import java.util.Arrays;

public class Sort3Nums {
    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 1, 0, 2, 0, 1};
        System.out.println(Arrays.toString(sort3nums(arr)));
    }

    public static int[] sort3nums(int[] arr) {

        int[] condition = {0, 1, 2};

        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == condition[0])
                num1++;
            if (arr[i] == condition[1])
                num2++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i < num1 ? condition[0] : i < num2 + num1 ? condition[1] : condition[2];
        }

        return arr;
    }

}
