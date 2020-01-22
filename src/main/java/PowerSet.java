import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        List<List> test = powerSet(nums);

        test.stream().forEach(lst -> {
            System.out.println(Arrays.toString(lst.toArray()));
        });
    }

    public static List<List> powerSet(List<Integer> X) {

        List<List> P = new ArrayList<>();
        List<Integer> S = new ArrayList<>();
        P.add(S);
        List<Integer> T;

        for (int i = 0; i < X.size(); i++) {
            int s = P.size();
            for (int j = 0; j < s; j++) {
                T = new ArrayList<>();
                T.add(X.get(i));
                T.addAll(P.get(j));
                P.add(T);
            }

        }

        return P;
    }
}
