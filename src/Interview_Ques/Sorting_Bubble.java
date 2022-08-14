/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interview_Ques;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class Sorting_Bubble {

    public static void main(String args[]) {
        int arr[] = {7, 8, 5, 6, 7, 9, 4, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
