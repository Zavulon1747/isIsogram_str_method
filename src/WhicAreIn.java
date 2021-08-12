import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WhicAreIn {
    public static void main(String[] args) {
        String[] a = new String[]{ "arp", "live", "strong" };
        String[] b = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        System.out.println(Arrays.toString(inArray(a,b)));
    }

    public static String[] inArray(String[] array1, String[] array2) {
        int countOfArray = -1;
        List<String> list = new ArrayList<>();

        for (String value : array1) {
            for (String s : array2) {
                if (s.contains(value)) {
                    ++countOfArray;
                     list.add(countOfArray, value);
                    break;
                }
            }
        }

        Collections.sort(list);


        return list.toArray(new String[list.size()]);
    }
}
