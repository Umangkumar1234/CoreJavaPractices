/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinearSearch;

/**
 *
 * @author hp
 */
public class MaxELementIn2DArray {
     public static void main(String args[]) {
        int[][] arr = {
            {7, 8, 9},
            {1, 96, 50, 20},
            {70, 40, 30, 86, 96},
            {63, 14}
        };
        int ans = search(arr);
        System.out.println(ans); 
    }

    static int search(int[][] arr) {
        int max=arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                  if(arr[row][col]>max){
                  max=arr[row][col];
                  }
            }

        }
        return max;
    }
}
