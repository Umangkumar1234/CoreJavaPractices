// NO of Arguments
//public class Overloading_Pro {
//    void show(){
//        System.out.println("1");
//    }
//    void show(int a){
//        System.out.println("2");
//    }
//    public static void main(String[] args){
//        Overloading_Pro O=new Overloading_Pro();
//        O.show();
//        O.show(8);
//    }
//}

//Sequence of Arguments
// public class Overloading_Pro{
//     void show(String s,int a){
//        System.out.println("1");
//     }
//     void show(int a ,String s){
//        System.out.println("2");
//     }
//     public static void main(String [] args){
//         Overloading_Pro O=new Overloading_Pro();
//         O.show("umang",45);
//         O.show(52,"Shivam");
//     }
//     
//     
// }

//Type of Arguments
public class Overloading_Pro{
        String s;
        void show(String s){
            this.s=s;
            System.out.println("3");
             System.out.println(s);
            
}
        void show(int a){
            System.out.println("5");
        }
        public static void main(String[] args){
            Overloading_Pro O=new Overloading_Pro();
            O.show("Umang");
            O.show(28);
        }
}