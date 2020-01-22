public class SecondSmallest {

    public static void main(String[] args) {
        int[] nums = {9};
        System.out.println(secondSmallest(nums));
    }

    public static int secondSmallest(int[] arr) {

        int num1 = arr[0];
        int num2 = arr[1];

        if(arr==null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        for (int i = 0 ; i < arr.length ; i ++){
            if(arr[i] < num1){
                num2 = num1;
                num1 = arr[i];
            }else {
                if(arr[i] < num2 && arr[i] > num1)
                    num2 = arr[i];
            }
        }
        return num2;
    }
}
