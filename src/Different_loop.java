
import java.util.*;

public class Different_loop {

    public static void main(String args[]) {
        int[] arr = {4, 5, 7, 8, 9, 6};
        int num1 = 2;
        int num2 = 4;
        swap(arr, num1, num2);
        
        System.out.println(Arrays.toString(arr));
        //while loop
        //        int i=0;
        //        while(i<5){
        //            System.out.println("HEllO World");
        //            i++;
        //        }

        // do-while loop
        //    int i=0;
        //    do{
        //       System.out.println("Hello world");
        //       i++;
        //        
        //    }while(i<5);
        //    }
        //}
        // largest number
        //        System.out.println("Enter 3 numbers ");
        //        Scanner input = new Scanner(System.in);
        //        int a = input.nextInt();
        //        int b = input.nextInt();
        //        int c = input.nextInt();
        //      
        //      int max=a;
        //      if(b>max){
        //          max=b;
        //      }
        //      if(c>max){
        //      max=c;
        //      }
        //      
        //      
        //      System.out.println(max);
        //
        //    }
        //}
        //Another method to calculate largest number
        //        int max = Math.max(c,Math.max(a, b));
        //        System.out.println("largest number is "+max);
        //        
        //trim method
        //Scanner sc=new Scanner(System.in);
        //char c=sc.next().trim().charAt(0);
        //System.out.println(c);
        //String name=sc.next();
        //for(int i=0;i<name.length();i++){
        //    System.out.print(name.charAt(i));
        //    
        //}
        // to identify uppercase and lowercase
        //    System.out.println("Enter string");
        //    Scanner sc=new Scanner(System.in);
        //    char ch=sc.next().trim().charAt(0);
        //    if(ch>='a' && ch<='z'){
        //    System.out.println("lowercase");
        //    }else{
        //        System.out.println("UPPERCASE");
        //    }
        //find the fibonacci series
        //Scanner sc=new Scanner(System.in);
        //int num=sc.nextInt();
        //
        //int a=0;
        //int b=1;
        //int c;
        //for(int i=0;i<num;i++){
        //    System.out.print(a+" ");
        //    c=a+b;
        //    a=b;
        //    b=c;
        //}
        // print nth fibonnaci number
        //
        //Scanner sc=new Scanner(System.in);
        //int num=sc.nextInt();
        //
        //int a=0;
        //int b=1;
        //int count=2;
        //while(count<=num){
        //     int temp=b;
        //     b=b+a;
        //     a=temp;
        //     count ++;
        //}
        //System.out.print(b);
        //
        //find repetition number
        //        Scanner sc = new Scanner(System.in);
        //        int num = sc.nextInt();
        //for(int i=0;i<num;i++){
        //}  
        //        int count = 0;
        //        while (num > 0) {
        //            int lastdigit = num % 10;
        //            if(lastdigit==7){
        //            count ++;
        //            }
        //            num = num / 10;
        //        }
        //        System.out.println(count);
        //find reverse number
        //        Scanner sc = new Scanner(System.in);
        //        int num = sc.nextInt();
        //
        //        int rev = 0;
        //        while (num > 0) {
        //            int lastdigit = num % 10;
        //            num = num / 10;
        //            rev = rev * 10 + lastdigit;
        //        }
        //        System.out.println(rev);
        //Switch case
        //        Scanner in = new Scanner(System.in);
        //        String fruit = in.next();
        //        switch (fruit) {
        //            case "mango":
        //                System.out.println("sweet fruit");
        //                break;
        //            case "banana":
        //                System.out.println("enery fruit");
        //                break;
        //            case "apple":
        //                System.out.println("juice fruit");
        //                break;
        //            default:
        //                System.out.println("Invalid input");
        //
        //        }
        // Prime number
        //        Scanner sc = new Scanner(System.in);
        //        int num = sc.nextInt();
        //        int isPrime=1;
        //        for (int i = 2; i*i <= num; i++) {
        //            if(num%i==0){
        //                isPrime=0;
        //            }
        //        }
        //        if(isPrime==0 || num<0){
        //          System.out.println("Number is not prime ");
        //          
        //        }else{
        //        System.out.println("Number is prme ");
        //        }
        //        
        // find armstrong number
        //        Scanner sc = new Scanner(System.in);
        //        int num = sc.nextInt();
        //        int temp=num;
        //        int sum = 0;
        //        while (num>0) {
        //            int rem = num%10;
        //            sum = sum + (rem * rem * rem);
        //            num = num/10;
        //        }
        //        if (temp == sum) {
        //            System.out.println("Number is armstrong ");
        //        } else {
        //            System.out.println("Number is not armstrong ");
        //        }
        //Array starts from here
        //        int[] arr = new int[5];
        //        System.out.println(arr[4]);
        // printing multidimensional array
        //        Scanner in = new Scanner(System.in);
        //        int[][] arr = new int[3][3];
        //        System.out.println(arr.length);//it will give no of rows
        //        
        //        for (int i = 0; i < arr.length; i++) {
        //            for (int j = 0; j < arr[i].length; j++) {
        //                arr[i][j] = in.nextInt();
        //            }
        //            
        //        }
        //        for(int i=0;i<arr.length;i++){
        //            for(int j=0;j<arr[i].length;j++){
        //                System.out.print(arr[i][j]); 
        //            }
        //            System.out.println();
        //        
        //        }
        // print using for each loop and enhance for loop
        //        for (int[] num : arr) {
        //            System.out.println(Arrays.toString(num));
        //            
        //        }
        // ArrayList
        //        Scanner in = new Scanner(System.in);
        //        ArrayList<Integer> list = new ArrayList<>(5);
        //        for (int i = 0; i < 5; i++) {
        //            list.add(in.nextInt());
        //        }
        //        System.out.println(list);
        //swap array element
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
