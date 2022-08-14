
public class NewClass {

    public static void main(String args[]) {
        int i = 1;
        while (i <= 5) {
            int j = 1;
            if (i % 2 == 0) {
                while (j <= i) {
                    if (j % 2 == 0) {
                        System.out.print("1 ");
                        j++;
                    } else {
                        System.out.print("0 ");
                        j++;
                    }
                }

            } else {
                while (j <= i) {
                    if (j % 2 == 0) {
                        System.out.print("0 ");
                        j++;
                    } else {
                        System.out.print("1 ");
                        j++;
                    }
                }
            }

            System.out.println("");
            i++;
        }
    }
}
