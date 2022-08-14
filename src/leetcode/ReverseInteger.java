/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author hp
 */
public class ReverseInteger {

    public static void main(String args[]) {
        int num = -2322;
        System.out.println(reverse(num));
    }

    static int reverse(int x) {
        int rev = 0;
        boolean neg = false;
        if (x < 0) {
            neg = true;
            x = -x;
        }
        while (x > 0) {

            int rem = x % 10;

            rev = (10 * rev + rem);
            if (rev > Integer.MAX_VALUE) {
                return 0;
            }
            x = x / 10;
        }

        return neg ? -rev : rev;

    }

}
