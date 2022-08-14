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
public class RemoveDuplicatFromArray {
    public static void main(String args[]){
    int []arr={0,0,1,1,1,2,2,3,3,3,3};
    System.out.println(dupElement(arr));
    }
    
    static int dupElement(int [] arr){
        int j=1;
    
        for( int i=0;i<arr.length-1;i++){
           if(arr[i]!=arr[i+1]){
               
               j++;
           }
            
              
        }
      
        
        
    return j;
    }
    
}
