/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.*;

public class PalidromeNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        int num1 = num;
        int rev = 0;
        while (num > 0) {
            int rem = num%10;
            rev =(10*rev + rem);
            num = num/10;
        }
        System.out.println(rev);
        if (num1==rev) {
            System.out.println("number is palindrome ");
        } else {
            System.out.println("number is not palindrome");
        }

    }

}
