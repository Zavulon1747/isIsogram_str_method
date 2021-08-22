public class TrailingZeros {
    public static void main(String[] args) {
        System.out.println(zeros(12));
    }

    public static int zeros(int n) {
        if (n == 0) return 0;
        int zeroCount = 0;
        for (int i = 5; n / i > 0; i *= 5) {
            zeroCount += n / i;
        }
        return zeroCount;
    }

}
