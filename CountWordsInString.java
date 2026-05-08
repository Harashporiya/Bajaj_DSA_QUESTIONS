public class CountWordsInString {
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length == 0 || words[0].isEmpty() ? 0 : words.length;
    }
}