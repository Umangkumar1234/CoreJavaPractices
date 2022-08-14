
package animal_object_initialize;

public class Solution {

    public static void main(String args[]) {
        int arr1[]={5,5,6,6,3,3,2,2,9};
        unique(arr1);
       
        
        
       
    }
  
    public static int[] unique(int [] arr){
          int result;
         int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
            }
            if (count == 0) {
              System.out.println(arr[i]);
               
            }
 
        }
        
      return arr;
    }
    
}
