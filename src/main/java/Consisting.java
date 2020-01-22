public class Consisting {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1, 1};
        consisting(arr);

    }

    public static void consisting(int[] arr) {

        int zero = indexOfLastZero(arr, arr.length - 1, 0) + 1;
        int one = arr.length - zero;

        printRs(zero, one);
    }

    public static int indexOfLastZero(int[] arr, int top, int bottom) {

        if (arr[0] == 1)
            return -1;
        if (arr[arr.length - 1] == 0)
            return arr.length - 1;
        else {
            int mid = (top - bottom) / 2 + bottom;
            if (arr[mid] == 0 && arr[mid + 1] == 1)
                return mid;
            else if (arr[mid] == 0 && arr[mid + 1] != 1)
                return indexOfLastZero(arr, top, mid);
            else
                return indexOfLastZero(arr, mid, bottom);
        }
    }

    public static void printRs(int zero, int one) {
        System.out.println("0s: " + zero);
        System.out.println("1s: " + one);
    }
}
