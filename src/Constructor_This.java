
class Demo {

    Demo() {
        System.out.println("This is no arg constructor");
    }

    Demo(int i) {
        this();
        System.out.println("This is parametrised constructor");
    }
}

public class Constructor_This {
    public static void main(String args[]){
    Demo d=new Demo(10);
    }
    
    
}
