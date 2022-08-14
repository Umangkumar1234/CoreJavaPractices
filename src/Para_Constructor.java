
public class Para_Constructor {
    String name;
    int Emp_id;
    Para_Constructor(String name,int Emp_id){
        this.name=name;
        this.Emp_id=Emp_id;
    }
    public static void main(String [] args){
        Para_Constructor p=new Para_Constructor("umang",52);
        System.out.println(p.name+" "+p.Emp_id);
      
        
  
}
}
