
package LinearSearch;


public class SerachingElement {
    public static void main(String args[]){
        int arr[]={8,5,9,6,4,223,2};
        int num=223;
    int num1=linearsearch(arr,num);
    System.out.println(num1);
    
    }
    static int linearsearch(int arr[], int target){
        if(arr.length==0){
           return -1; 
        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//            return true;
//            }
        for(int element:arr){
            if(element==target){
            
            return element;
                    }
        
        }
    
    return -1;
    }
}
