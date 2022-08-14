
class A {
       void showA(){
           System.out.println("A class method");
       }
}

class B extends A{
    void showB(){
        System.out.println("B class method");
    }
}
class C extends B{
    void showC(){
        System.out.println("C class method");
}

  public static void main(String [] args){
        A a=new A();
        a.showA();
         B b=new B();
        b.showA();
        b.showB();
        C c=new C();
        c.showA();
        c.showB();
        c.showC();
}
}
