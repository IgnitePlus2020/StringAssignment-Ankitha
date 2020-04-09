package com.tgt.igniteplus;
//Write a program to remove hyphen (-) from the given string only if it is in b/w digits .
//        Given string : 134-10/5566 A-block, Manyata Tech-Park

import java.util.*;

public class RemoveHyphen {

    public static void removeHyphen(String s ){
        char[] t = s.toCharArray();
        for(int i =0;i<t.length;i++){
            if(t[i]=='-'){
                int temp = t[i-1];
                int temp1 = t[i+1];
                if(temp1<65 && temp<65){
                    t[i]=t[i+1];
                    i++;
                }
            }
        }
        System.out.print(t);

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = "134-10/5566 A-block, Manyata Tech-Park";
        removeHyphen(s);
    }
}
//Output:
//        134110/5566 A-block, Manyata Tech-Park
//        Process finished with exit code 0