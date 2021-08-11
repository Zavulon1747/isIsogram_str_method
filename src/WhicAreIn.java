import java.util.Arrays;

public class WhicAreIn {
    public static void main(String[] args) {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        System.out.println(Arrays.toString(inArray(a,b)));
    }

    public static String[] inArray(String[] array1, String[] array2) {
        int countOfArray = -1;
        String[] array3 = new String[array1.length];

        for (String value : array1) {
            for (String s : array2) {
                if (s.contains(value)) {
                    countOfArray++;
                    array3[countOfArray] = value;
                    break;
                }
            }
        }
        String[] arrayReturn = new String[countOfArray+1];
        for (int i = 0; i <=countOfArray; i++) {
            arrayReturn[i] = array3[i];
        }

        return arrayReturn;
    }
}
