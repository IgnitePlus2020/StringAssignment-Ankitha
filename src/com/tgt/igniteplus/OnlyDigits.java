package com.tgt.igniteplus;
//Write	a	program	to check if a String contains only digits?
import java.util.*;
public class OnlyDigits {

    public static boolean isDigits(String s ){
        char [] t = s.toCharArray();
        for(int i =0;i<t.length;i++){
            int temp = t[i];
            if(temp>=65){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        boolean val = isDigits(s);
        if(val == false){
            System.out.println("Hey the string contains a few letters too");
        }
        else{
            System.out.println("The string has only numbers");
        }
    }
}

//output:
//
//        "Hello123"
//        Hey the string contains a few letters too
//
//        Process finished with exit code 0
