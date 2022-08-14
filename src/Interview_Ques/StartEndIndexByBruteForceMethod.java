package Interview_Ques;
import java.util.Arrays;
public class StartEndIndexByBruteForceMethod {

    public static void main(String args[]) {
        int arr[] = {28, 9, 6, 63, 3, 3, 3, 3, 16, 18};
        int target = 3;
        int ans3[]=StartEndIndex(arr,target);
        System.out.println(Arrays.toString(ans3));
    }
// it will not work properly pls use binart search and solve this question easily.

    static int []StartEndIndex(int arr[], int target) {
        int ans = 0;
        int ans1 = 0;
        int count = 0;
        int count1 = 0;
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                count++;
            }
            if (count == 2) {
                ans = i;
            }
        }
        for (j = arr.length - 1; j > 0; j--) {
            if (arr[j] == 3) {
                count1++;
            }
            if (count1 == 1) {
                ans1=j;
            }
        }
        arr[0]=ans;
        arr[1]=ans1;
        
        return arr;
    }
}
