package leetcode;

public class CountNoOfWord {

    public static void main(String args[]) {
        String str1 = "luffy is still joyboy";
        String str = str1.trim();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isWhitespace(ch)) {
                count++;
            }
           
        }
         System.out.print(count);

    }

}

