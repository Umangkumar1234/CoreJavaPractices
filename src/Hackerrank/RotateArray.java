/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hackerrank;

/**
 *
 * @author hp
 */
import java.util.Arrays;
public class RotateArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int k=4;
        int num=arr.length;
        int num1[]=new int[num];
        for(int i=0;i<num;i++){
            num1[i]=arr[i];
        }
        
        for(int i=0;i<num;i++){
            arr[(i+k)%num]=num1[i];
            
        
        }
        
        
        System.out.println(Arrays.toString(arr));
        
    
    
  
    }
    
}
