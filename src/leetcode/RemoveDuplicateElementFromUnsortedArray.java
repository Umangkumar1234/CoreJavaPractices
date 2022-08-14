
package leetcode;

import java.util.HashSet;
public class RemoveDuplicateElementFromUnsortedArray {
    public static void main(String args[]){
    int []arr={1,1,2,2,3,3,3,4,4,9,9,6,6,8,8};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        
        }
        for(int num:hs){
           System.out.print(num+" ");
        }
            
      
   
}
}
