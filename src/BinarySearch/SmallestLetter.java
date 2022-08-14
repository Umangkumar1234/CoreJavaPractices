/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author hp
 */
public class SmallestLetter {

    public static void main(String args[]) {
        char ch[] = {'c', 'j', 'm', 'p'};
        char target = 'p';
        System.out.println(nextGretestLetter(ch, target));
    }

    static char nextGretestLetter(char ch[], char target) {
        int start = 0;
        int end = ch.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < ch[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (ch[start%ch.length]);
    }

}
