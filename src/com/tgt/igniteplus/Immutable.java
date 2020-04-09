//Write	a	program	to	prove	String	is	immutable.

package com.tgt.igniteplus;
import java.util.*;
public class Immutable {
    public static void main(String[] args) {
        String s1 = "hello";
        s1.concat(" world");
        System.out.println(s1);
        if(s1 == "hello world"){
            System.out.println("String is mutable");
        }
        else{
            System.out.println("String is not mutable");
        }
    }

}

//Output:
//        hello
//        String is not mutable
//
//        Process finished with exit code 0
