public class Isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("DimadD"));
    }

    public static boolean isIsogram(String str) {
        char[] characters = str.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < characters.length; j++) {
                if (i==j) break;
                if (Character.toLowerCase(characters[i])==Character.toLowerCase(characters[j])) return false;
                }
            }
        return true;
        }
    }
