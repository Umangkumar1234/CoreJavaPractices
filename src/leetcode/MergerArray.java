/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author hp
 */
import java.util.Arrays;
public class MergerArray {
    public static void main(String args[]){
        int nums1[]={1,2,3};
        int nums2[]={2,5,6};
        int len=nums1.length+nums2.length;
        int nums3[]=new int[len];
        
        for(int i=0;i<nums1.length;i++){
             nums3[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            nums3[nums1.length+j]=nums2[j];
        }
        int num[]=new int[len];
         num=nums3;
         
         
         
        
      System.out.println(Arrays.toString(num));  
    }
      

    }
    

