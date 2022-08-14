
package leetcode;
import java.util.Arrays;
public class ConcatArray {
    public static void main(String args[]){
//     int a[]={4,5,6};
//     int b[]={7,8,9};
//     int num=a.length + b.length;
//     int c[]=new int[num];
//     
//     for(int i=0;i<a.length;i++ ){
//         c[i]=a[i];
//     }
//     
//     for(int j=0;j<b.length;j++){
//         c[b.length+j]=b[j];
//     }
//     
//     System.out.println(Arrays.toString(c));
     
        int a[]={4,5,6};
        int num=2 * a.length;
        int b[]=new int[num];
        
        for(int i=0;i<a.length;i++){
           b[i]=a[i];
           b[i+a.length]=a[i];
        }
        
       System.out.println(Arrays.toString(b));
     
    }
    
}
