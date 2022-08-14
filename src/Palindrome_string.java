
import java.util.*;

public class Palindrome_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.next();
        String str1 = str;
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
//      System.out.print(rev);
        if (str1.equals(rev)) {
            System.out.println(str1 + " " + " Palindrome string ");
        } else {
            System.out.println(str1 + "String is not palindrome ");
        }
    }
}
