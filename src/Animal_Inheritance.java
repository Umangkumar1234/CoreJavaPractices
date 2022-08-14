
      class Animal_Inheritance {
        void eat(){
            System.out.println("I'm eating");
        }
}
        class Dog extends Animal_Inheritance{
            void run(){
                System.out.println("I'm running");
            }
            public static void main(String [] args){
                
                Animal_Inheritance a=new Animal_Inheritance();
                a.eat();
                Dog d=new Dog();
                d.run();
                d.eat();
            }
        }
