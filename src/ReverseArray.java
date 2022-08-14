/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.*;

public class ReverseArray {

    public static void main(String args[]) {

        int[] arr = {4, 5, 7, 8, 9, 6};
        System.out.println(Arrays.toString(arr));
        int j = arr.length-1;
        int arr1[] = new int[arr.length];

        for (int i = 0; i <arr.length; i++) {
            arr1[j] = arr[i];
            j--;

        }
           System.out.println(Arrays.toString(arr1));

    }
}
