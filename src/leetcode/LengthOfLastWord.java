/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author hp
 */
public class LengthOfLastWord {
    public static void main(String args[]){
        String str=" Welcome to java programming ";
        int len=str.trim().length()-str.trim().lastIndexOf(" ")-1;
        System.out.println(len);
    
    }
    
}
