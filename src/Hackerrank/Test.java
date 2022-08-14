package Hackerrank;

import java.util.*;

public class Test {

    public static void main(String args[]) {
//        int num=98695;
//        System.out.println(digit(num));
//    }
//    
//    static boolean digit(int num){
//        int count1 = 0;
//        while (num > 0) {
//            count1++;
//            num = num / 10;
//
//        }
//        if (count1 % 2 != 0) {
//            return false;
//        }
//
//        return true;
//    
//  

        int arr[] = {86,63,96,-98};
        System.out.println(wow(arr));
    }
    static int wow(int arr1[]) {
        
        int count = 0;
        for (int num:arr1) {
            if (num<0){
            num=num*(-1);
            }
            if(num%2==0) {
                count++;
               
            }
        }
        return count;
    }
}
