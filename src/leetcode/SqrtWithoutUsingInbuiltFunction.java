
package leetcode;


public class SqrtWithoutUsingInbuiltFunction {
    public static void main(String args []){
        int num=8;
        System.out.println(sqrt(num));
        
    
    }
    public static int sqrt(int num){
        // using linear search
//        int i=1;
//        while(i*i<=num){
//               i++; 
//        
//        }
//        return i-1;
        
        // using binary search
        
        int start=1;
        int end=num;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            
        int sqr=mid*mid;
        if(sqr==num){
          return mid ;
        
        }else if(sqr<num){
            ans=mid;
            start=mid+1;
        }else{
            
            end=mid-1;
        }
        
        }
    
    return ans;
    }
    
}
