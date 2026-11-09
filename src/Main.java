public class Main {
    static void main() {
        String word = "cartoon";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i< word.length(); i++) {
            sb.append(word.charAt(i));
        }

        String newWord = sb.substring(0).toString();

//        System.out.println(sb.reverse());
//        System.out.println(isPalindrome(word));
    }

    public static boolean isPalindrome (String words) {
        return words.equals(new StringBuilder(words).reverse().toString());
    }
}