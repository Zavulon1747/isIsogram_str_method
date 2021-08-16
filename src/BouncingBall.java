public class BouncingBall {

    public static void main(String[] args) {
        System.out.println(BouncingBall.bouncingBall(-1, 0.66, 1.5));
    }

    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || (bounce <= 0 || bounce >= 1) || window >= h) return -1;
        double otskokHeightNext = h * bounce;
        int motherHadSeen = 1;
        while (otskokHeightNext > window) {
            motherHadSeen += 2;
            otskokHeightNext *= bounce;
        }
        return motherHadSeen;
    }
}
