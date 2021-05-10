public class StringCombinations {

    public static void combinations(char[] text, char[] pattern, int index, int pos) {
        if (text.length == index) {
            System.out.println(String.valueOf(pattern));
            return;
        }

        pattern[pos] = text[index];
        pattern[pos+1] = ' ';

        combinations(text, pattern, index+1, pos+2);

        if (text.length != index+1) {
            combinations(text, pattern, index+1, pos+1);
        }
    }

    public static void main(String[] args) {
        char[] arr = "123".toCharArray();
        char[] arr2 = new char[100];
        combinations(arr,arr2, 0, 0);
    }
}