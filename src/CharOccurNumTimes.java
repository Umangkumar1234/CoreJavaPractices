/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.*;

public class CharOccurNumTimes {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String str = sc.next();
        for(int i=0;i<str.length();i+=2){
        char ch=str.charAt(i);
        char num=str.charAt(i+1);
        int number=Character.getNumericValue(num);
        for(int j=0;j<number;j++){
            System.out.print(ch+" ");
        }
        }

    }

}
