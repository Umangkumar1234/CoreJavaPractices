/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author hp
 */
public class SearchInsertPosition {
    public static void main(String args[]){
    int arr[]={1,3,5,6};
    int val=59;
    System.out.println(searchInsert(arr,val));
   }
     public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
        if(nums[mid]<target){
            start=mid+1;
          
        }
        else if(nums[mid]>target){
            end=mid-1;    
        }
        else{
            return mid;
        }
      
        }
        
     return end+1;   
    }
    
}
