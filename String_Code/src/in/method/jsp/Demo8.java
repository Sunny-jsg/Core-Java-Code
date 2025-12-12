package in.method.jsp;

public class Demo8 {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "llo";
        String temp = "";

        for (int i = 0; i < str.length(); i++) {

            // Check if substring matches "llo"
            if (i <= str.length() - str2.length() && 
                str.charAt(i) == 'l' &&
                str.charAt(i + 1) == 'l' &&
                str.charAt(i + 2) == 'o') {

                temp += 'x';

                // Skip the next 2 characters ('l' and 'o')
                i += str2.length() - 1;  
            } 
            else {
                temp += str.charAt(i);
            }
        }

        System.out.println(temp);
        String str3 = str.replace("llo", "x");
        System.out.println(str3);
    }
}
