/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author hp
 */
public class RemoveAnELement {
    public static void main(String [] args){
        int arr[]={0,1,2,2,3,0,4,2};
        int num=2;
        System.out.println(removeElement(arr,num));
    
    }
    
    public static int removeElement(int arr[],int num){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=2){
            arr[j]=arr[i];
            j++;
            }
        }
        
    
  return j;
    }
    
}
