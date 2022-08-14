package LinearSearch;

import java.util.Arrays;

public class SearchInString {

    public static void main(String args[]) {
        String name = "Umang";
        char ch = 'U';
  
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name,ch));
    }

    static boolean search(String str, char ch1) {
        if (str.length() == 0) {
            return false;
        }
//        for (int i = 0; i < str.length(); i++) {
//            if (ch1 == str.charAt(i)) {
//                return true;
//            }
        for (char ch2 : str.toCharArray()) {
            if (ch1 == ch2) {
                return true;
            }
        }

        return false;
    }

}
