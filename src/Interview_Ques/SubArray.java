/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interview_Ques;

/**
 *
 * @author hp
 */
import java.util.*;
import java.util.Arrays;

public class SubArray {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < num; i++) {
            int sum=0;
            for (int j = i; j < num; j++) {
                
                    sum = sum + arr[j];
                    if (sum < 0) {
                        count++;
                    }

                }
 }
        System.out.print(count);

    }
}
