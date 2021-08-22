public class FindOdd {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int findIt(int[] a) {
        int count = 0;

        for (int num : a) {
            for (int num2 : a) {
                if (num == num2) count++;
            }
            if (count % 2 == 0) {
                count = 0;
            } else return num;
        }
        return 0;
    }
}
