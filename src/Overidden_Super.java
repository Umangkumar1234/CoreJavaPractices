
class test {

    void show() {
        System.out.println("HEllo how are you");
    }
}

class Overidden_Super extends test {
    void show(){
        //super.show();//with the help of super keyword we can access parent class also
        System.out.println("Hey i want to access test class ");
    
    }
    public static void main(String args[]) {
        Overidden_Super os=new Overidden_Super();
        os.show();
       // test t=new test();
        //t.show();
    }
}
