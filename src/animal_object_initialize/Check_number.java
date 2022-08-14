
package animal_object_initialize;

import java.util.Scanner;

public class Check_number {
    public static int check(int a[],int n, int b){
        if(a.length==0)
            return 0;
        if(a[a.length]==b)
            return n;
        return check(a,n-1,b);
        
//        for(int i=0;i<a.length;i++){
//            if(a[i]==b)
//                return 1;
//        }
        //return 0;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int b=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(check(a,n-1,b));
    }
}
