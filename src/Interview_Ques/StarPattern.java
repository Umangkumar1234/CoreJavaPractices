
package Interview_Ques;

public class StarPattern {
    public static void main(String args[]){
        int num=5;
        for(int i=1;i<=num;i++){
//             for( int j=1;j<=num-i;j++){
//            System.out.print(" ");
//            }
//             
//            for(int k=1;k<=2*i-1;k++){
//            System.out.print(k);
//       
//            }
            for(int j=1;j<=i;j++){
                System.out.print((int)Math.pow(i,j)+" ");
            }
            System.out.println();
            
           
                
        }
    }
    
}
