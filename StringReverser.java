public class StringReverser {

    public static String reverseWord(String str) {
        int n = str.length();
        char[] arr = str.toCharArray();
        int i = 0, j = n - 1;
        while (i < j) {
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String originalString = "Hello, world!";
        String reversedString = reverseWord(originalString);
        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }
}
