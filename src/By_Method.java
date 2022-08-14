
public class By_Method {
        String color;
        int age;
        void intobj(String c,int a){
            color=c;
            age=a;
        }
    void display(){
        System.out.println(color+" "+age);
    }
    
    public static void main( String [] args){
        By_Method b=new By_Method();
        b.intobj("Black",5);
        b.display();
    }
}
