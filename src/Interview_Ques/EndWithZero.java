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
public class EndWithZero {

    public static void main(String args[]) {
        int arr[] = {1, 8, 0, 6, 5, 0, 3, 0, 2, 0, 5};
        int arr1[] = new int[arr.length];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr1[arr1.length-1]=0;
            }else{
                arr1[k]=arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr1));
        

    }
}
