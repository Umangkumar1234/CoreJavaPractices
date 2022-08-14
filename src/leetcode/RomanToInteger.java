/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author hp
 */
public class RomanToInteger {
    public static void main(String args[]){
     String str="XII";
    char I=1;
    char V=5;
    char X=10;
    char L=50;
    char C=100;
    char D=500;
    char M=1000;
    int sum=0;
    for(int i=str.length()-1;i>=0;i--){
        sum=sum+str.charAt(i);
    
    
    }
    System.out.println(sum);
    
    
    }
    
}
