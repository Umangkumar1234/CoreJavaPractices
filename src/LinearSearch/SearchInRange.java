package LinearSearch;

public class SearchInRange {

    public static void main(String args[]) {
        int arr[] = {8, 5, 9, 6, 4, 223, 2};
        int num = 8;
        int num1 = linearsearch(arr, num, 2, 6);
        System.out.println(num1);

    }

    static int linearsearch(int arr[], int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
// it will return if above return is not executed.
        return -1;
    }

}
