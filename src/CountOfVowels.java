public class CountOfVowels {
    public static void main(String[] args) {
        System.out.println(countOfVowels("privetetetetetetet"));
    }

    public static int countOfVowels (String str) {
        int countOfVowels = 0;

        char[] strChars = str.toCharArray();
        char[] vowels = {'a', 'o', 'e', 'i', 'u'};
        for (char vowel : vowels) {
            for (char strChar : strChars) {
                if (vowel == strChar) countOfVowels++;
            }
        }

        return countOfVowels;
    }
}
