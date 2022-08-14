
package Interview_Ques;


public class ProductOfDigit {
    
    public static void main(String args[]){
            int num=5244;
            int pro=1;
            while(num>0){
                int rem=num%10;
                pro=pro*rem;
                num=num/10;
            
            
            }
            System.out.println(pro);
    
    
    
    }
    
}
