import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {

        int[] arr1 = {2, 5, 6, 8, 9};
        int[] arr2 = {1, 3, 4, 5, 7, 8, 9};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] merge = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;

        for (int k = 0; k < merge.length; k++) {
            if (i < arr1.length && j < arr2.length && arr1[i] <= arr2[j]) {
                merge[k] = arr1[i];
                i++;
            }else if(i < arr1.length && j < arr2.length && arr1[i] > arr2[j]){
                merge[k] = arr2[j];
                j++;
            }else {
                if(i < arr1.length){
                    merge[k] = arr1[i];
                    i++;
                }
                if(j < arr2.length){
                    merge[k] = arr2[j];
                    j++;
                }
            }

        }
        return merge;
    }
}
