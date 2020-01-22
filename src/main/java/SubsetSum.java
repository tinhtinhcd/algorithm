import java.util.ArrayList;
import java.util.List;

public class SubsetSum {

    public static void main(String[] args) {
        int[]a= {1, 3, 9, 4, 8, 5};
        System.out.println(subsetSum(a,21));
    }

    public static List<Integer> subsetSum(int[] arr, int k){

        List<List> P = new ArrayList<>();
        List<Integer> S = new ArrayList<>();
        P.add(S);
        List<Integer> T;

        for (int i = 0; i < arr.length; i++) {
            int s = P.size();
            for (int j = 0; j < s; j++) {
                T = new ArrayList<>();
                T.add(arr[i]);
                T.addAll(P.get(j));
                if(T.stream().mapToInt(Integer::intValue).sum()==k)
                    return T;
                P.add(T);
            }
        }

        return null;
    }
}
