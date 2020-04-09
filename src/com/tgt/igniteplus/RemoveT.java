package com.tgt.igniteplus;

//Write a program to remove all occurrences of a given character from input String:
//        Given string : To test this string >> remove all ‘t/T’ from this string and print .
import java.util.*;
public class RemoveT {

    public static void removeChar(String s1, char c){
        int j, count = 0, n = s1.length();
        char []t = s1.toCharArray();
        for (int i = j = 0; i < n; i++)
        {
            if (t[i] != c)
                t[j++] = t[i];
            else
                count++;
        }

        while(count > 0)
        {
            t[j++] = '\0';
            count--;
        }

        System.out.println(t);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1 =  input.nextLine();
        char c = input.next().charAt(0);
        removeChar( s1,c);
    }
}
//Output:
//        Hello Word
//        H
//        ello Word
//
//        Process finished with exit code 0