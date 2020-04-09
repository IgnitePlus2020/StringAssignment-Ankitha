package com.tgt.igniteplus;
import java.util.*;
public class CompareString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        if(s1.equals(s2)){
            System.out.println("They are the same");
        }
        else{
            System.out.println("They are not the same");
        }

    }
}
//Output:
//        hello
//        hello
//        They are the same
//
//        Process finished with exit code 0