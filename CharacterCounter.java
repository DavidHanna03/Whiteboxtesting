public class CharacterCounter {
    public static int countOccurrences(char[] array, char target) {
        int count = 0;
        for (char c : array) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'a', 'b', 'a', 'a'};
        char target = 'a';
        int count = countOccurrences(array, target);
        System.out.println("The character '" + target + "' occurred " + count + " times.");
    }
}
