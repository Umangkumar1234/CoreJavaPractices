/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author hp
 */

// Facebook interview question
import java.util.*;
public class FirstAndLastPosition {

    public static void main(String[] args) {
         int arr[] = {28, 9, 6, 63, 3, 3, 3, 3, 16, 18};
        int target = 3;
        int ans3[]=searchRange(arr,target);
        System.out.println(Arrays.toString(ans3));
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
   static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
