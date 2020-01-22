import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

public class ReverseInt {

    public static void main(String[] args) {
        int i = 1534236469;
        i = reverse(i);
        System.out.println(i);
    }

    public static int reverse(int x) {
        char[] arr = String.valueOf(Math.abs(x)).toCharArray();
        reverse(arr, 0);
        try {
            int num = Integer.parseInt(String.valueOf(arr));
            return x>0?num:-num;
        }catch (Exception e){
            return 0;
        }
    }

    public static void reverse(char[] arr, int index) {

        if (index > arr.length / 2 - 1)
            return;

        char temp = arr[index];
        arr[index] = arr[arr.length - 1 - index];
        arr[arr.length - 1 - index] = temp;

        reverse(arr, index+1);
    }
}
