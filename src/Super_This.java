/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class SuperThisDemo {

    int a = 40;
}

public class Super_This extends SuperThisDemo {

    int a = 10;

    void show(int a) {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
    public static void main(String args[]){
    Super_This st=new Super_This();
    st.show(50);
    }

}
