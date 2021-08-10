public class Isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("DimaD"));// dimad -> d i m a d -> d i m a -> 4
    }

    public static boolean isIsogram(String str) {
        System.out.println(str.toLowerCase().chars().distinct().count());
        return str.length() == str.toLowerCase().chars().distinct().count();
        }
    }
