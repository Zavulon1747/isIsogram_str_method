public class Kata {
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }));
    }

    public static double findUniq(double[] arr) {
        double temp;
        if(arr[0]==arr[1]) {temp = arr[0];}
        else if (arr[0]==arr[2]) {return arr[1];}
        else {return arr[0];}
        for(Double needIt : arr) {
            if (!(temp == needIt)) {
                return needIt;
            }
        }
        return arr[0];
    }
}
