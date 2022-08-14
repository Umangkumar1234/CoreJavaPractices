/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author hp
 */
public class Palindrome {
    public static void main(String args[]){
        int num=128921;
        System.out.println(isPalindrome(num));
    
    }
    
    static boolean isPalindrome(int x) {
        int n=x;
        if(x<0){
            return false;
        }
          int rev=0;
        while(x>0){
      
        int rem = x%10;
            rev =(10*rev + rem);
            x = x/10;
        }
        if(n==rev){
            return true;
        
        }
     
        
     return false;   
    }
    
}
