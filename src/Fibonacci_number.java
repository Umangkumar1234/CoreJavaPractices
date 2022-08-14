import java.util.Scanner;
public class Fibonacci_number {
    public static void main(String []args){
        int a=0, b=1,c;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter any number");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        
    }
}
