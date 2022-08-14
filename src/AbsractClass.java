/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */

abstract class Vehicle{
    abstract void show();

}

class Car extends Vehicle{
    void show(){
    System.out.println("Car starts with key");
    
    }
}
class Scooter extends Vehicle{
    void show(){
    System.out.println("Scooter starts with kick ");
    }

}
public class AbsractClass {
    public static void main(String args[]){
    Car c=new Car();
    c.show();
    Scooter s=new Scooter();
    s.show();
    
    }
    
    
    
    
}
