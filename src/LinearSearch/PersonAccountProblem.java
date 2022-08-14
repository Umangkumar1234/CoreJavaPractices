package LinearSearch;

public class PersonAccountProblem {

    public static void main(String args[]) {
        int arr[][] = {
            {7, 8, 9},
            {2, 5, 4}
        };
        System.out.println(maximumWealth(arr));

    }

    static int maximumWealth(int arr[][]) {

        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < arr.length; person++) {
            int sum = 0;
            for (int account = 0; account < arr[person].length; account++) {
                sum = sum + arr[person][account];
            }
            if (sum > ans) {
                ans = sum;

            }
        }

        return ans;
    }

}
