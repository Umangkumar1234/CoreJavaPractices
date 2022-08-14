/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

import java.util.Arrays;
public class TwoSum {
    
    public static void main(String args[]){
      int arr[]={3,2,3}; 
      int target=6;
      
      int abc[]=twosum(arr,target);
      System.out.println(Arrays.toString(abc));
      
    
    }
    static int[] twosum(int arr[],int target){
        int ab[]=new int[2];
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]+arr[j]==target){
                   ab[0]=i;
                   ab[1]=j;
               }
           
           }
            
//        if(arr[i]+arr[i-1]==target){
//            ab[0]=i-1;
//            ab[1]=i;
//        }
        }
    return ab;
    }
    
}
