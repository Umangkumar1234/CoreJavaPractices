/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */

interface demo{
    void show();
    void display();
    public static final int a=10;
}

public class Interface_Class implements demo{
   public void show(){
       System.out.println("This is show method body ");
   };
    public void display(){
       System.out.println("This is show method body ");
   };
     
    public static void main(String args[]){
        Interface_Class ic=new Interface_Class();
        ic.show();
        ic.display();
    }
}
