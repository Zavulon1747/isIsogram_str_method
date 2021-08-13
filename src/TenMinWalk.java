public class TenMinWalk {
    public static void main(String[] args) {
        System.out.println(TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

    public static boolean isValid(char[] walk) {
        double x = 0;
        double y = 0;
        int totalCount = 0;
        for (char c : walk) {
            if (c == 'n') {
                y += 0.1;
                totalCount++;
            } else if (c == 's') {
                y -= 0.1;
                totalCount++;
            } else if (c == 'e') {
                x++;
                totalCount++;
            } else if (c == 'w') {
                x--;
                totalCount++;
            }
        }
        return (x == 0 && y == 0) && totalCount == 10;
    }
}
