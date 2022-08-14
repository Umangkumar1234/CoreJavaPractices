/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package animal_object_initialize;

/**
 *
 * @author hp
 */
public class Animal_Object_Initialize {
        public void eat(){
        System.out.println("I'm eating ");
}
    
    public static void main(String[] args) {
        System.out.println("The king of forest is the lion");
        Animal_Object_Initialize a=new Animal_Object_Initialize();
        a.eat();
        a.run();
    }
public void run(){
    System.out.println("I'm running ");
}

    }
