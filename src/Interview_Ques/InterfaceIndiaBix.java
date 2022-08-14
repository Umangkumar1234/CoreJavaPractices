/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interview_Ques;

/**
 *
 * @author hp
 */

    interface Count 
{
    final static short counter = 0;
    void countUp();
}
public class InterfaceIndiaBix implements Count 
{
    public static void main(String [] args) 
    {
         InterfaceIndiaBix t = new InterfaceIndiaBix();
       t.countUp();
    }
    public void countUp() 
    {
        for (int x = 6; x>counter; x--, ++counter) /* Line 14 */
        {
            System.out.print(" " + counter);
        }
    }
}

