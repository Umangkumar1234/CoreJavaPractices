
package Hackerrank;

import java.util.*;
import java.util.Arrays;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
       a= a.toLowerCase();
        b=b.toLowerCase();
        if (len1 == len2) {
            char[] ch1 = a.toCharArray();
            char[] ch2 = b.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1, ch2)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
