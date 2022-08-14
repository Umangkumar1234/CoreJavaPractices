package Interview_Ques;

 class Test120 extends Thread {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.print("C" + " ");
            System.out.print("D" + " ");
        }
    }

    public static void main(String args[]) {

        Test120 t2 = new Test120();
        s1 t1 = new s1();
        t2.start();
        t1.start();
    }
}

class s1 extends Thread {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.print("A" + " ");
            System.out.print("B" + " ");
        }
    }
}
