
package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String args[]) {
        int[][] arr = {
            {7, 8, 9},
            {1, 96, 50, 20},
            {70, 40, 30, 86, 96},
            {63, 14}
        };
        int target = 300;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                  if(arr[row][col]==target){
                  return new int []{row,col};
                  }
            }

        }
        return new int[]{-1,-1};
    }

}
