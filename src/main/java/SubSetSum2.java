public class SubSetSum2 {

    public static void main(String[] args) {
        int[] a = {1, 3, 9, 4, 8, 5};
        System.out.println(isSSS(a, 111));

    }

    public static boolean isSSS(int[] arr, int k){
        return subsetSum(arr, k, 0);
    }

    public static boolean subsetSum(int[] arr, int k, int index) {
        if (k == 0)
            return true;
        if (k < 0)
            return false;
        if (arr.length - index == 1)
            return arr[0] == k;
        index++;
        return subsetSum(arr, k, index) || subsetSum(arr, k - arr[arr.length - index], index);
    }
}
