import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArrayDiff.arrayDiff(new int [] {1,2,2,1,3}, new int[] {1,3})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        if (b.length==0) return a;
        List<Integer> list = new ArrayList<>();
        for (int i : b) {
            for (int j = 0; j < a.length; j++) {
            }
            }


        int[] c = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            c[i] = list.get(i);
        }

        return c;
    }

}
