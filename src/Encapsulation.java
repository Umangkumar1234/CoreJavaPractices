/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class Employee1{
    private int emp_id;
    public void setEmp_id(int e_id){
    emp_id=e_id;
    }
    public int getEmp_id(){
    return emp_id;
    }
}
public class Encapsulation {
    public static void main(String args[]){
        Employee1 emp=new Employee1();
        emp.setEmp_id(501);
        System.out.println(emp.getEmp_id());
    }
}
