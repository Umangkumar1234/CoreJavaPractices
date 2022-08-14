/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinearSearch;

public class CountNoOfEvenDigits {

    public static void main(String args[]) {

        int arr[] = {7,89,456,1259,4555555,63};
        System.out.println(EvenCount(arr));

    }

    static int EvenCount(int arr[]) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;

            }
        }

        return count;
    }

    static boolean even(int num1) {
        int count1 = 0;
        while (num1 > 0) {
            count1++;
            num1 = num1 / 10;

        }
        if (count1 % 2 != 0) {
            return false;
        }

        return true;
    }

}
