
public class Employee {
    String name;
    int emp_id;
    Employee(String name,int emp_id){
        this.name=name;
        this.emp_id=emp_id;
        
    }
     void display(){
        System.out.println(name+" "+emp_id);
}
     public static void main(String[] args){
         Employee e=new Employee("Umang",20);
         e.display();
         
     }
}
