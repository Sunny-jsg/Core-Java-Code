package in.sunny;

public class ReverseEachChar {
	public static void main(String[] args) {
		String s1 = "Hello World";
		String eachChar = reverseEachChar(s1);
		System.out.println(eachChar);
	}

	public static String reverseEachChar(String s) {
        char[] ch = s.toCharArray();
        int start = 0;

        for (int i = 0; i <= ch.length; i++) {
            if (i == ch.length || ch[i] == ' ') {  
                reverse(ch, start, i - 1);   // reverse each word
                start = i + 1;               // move start to next word
            }
        }
        return new String(ch);
    }

    private static void reverse(char[] ch, int left, int right) {
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    }
}