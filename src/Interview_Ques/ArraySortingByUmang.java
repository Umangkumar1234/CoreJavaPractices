package Interview_Ques;

public class ArraySortingByUmang {

    public static void main(String args[]) {
        int num1[] = {1, 2, 3};
        int num2[] = {2, 5, 6};
        int len = num1.length + num2.length;
        int num3[] = new int[len];
        int i = 0;
        int j = 0;
        int k = 0;

        while (k < len) {
            if (i < num1.length && j < num2.length) {
                if (num1[i] < num2[j]) {
                    num3[k] = num1[i];
                    i++;
                    k++;

                } else {
                    num3[k] = num2[j];
                    j++;
                    k++;

                }
            }
            else if (i == num1.length) {
                num3[k] = num2[j];
                 j++;
                 k++;
            }
           

           else if (j == num2.length) {
                num3[k] = num1[i];
                 i++;
                 k++;

            }
           
        }

        for (int m = 0; m < len; m++) {
            System.out.print(num3[m] + " ");
        }

    }
}
