public class Main {
    public static void main(String[] args) {
        String input = "J@va the be$t!123";
        String result = reverseLetters(input);
        System.out.println("Input:  " + input);
        System.out.println("Output: " + result);
    }

    public static String reverseLetters(String input) {
        if (input == null) {
            return "";
        }
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
