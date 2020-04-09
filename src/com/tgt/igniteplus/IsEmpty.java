package com.tgt.igniteplus;
//Write	a	program	to	check	if	the	String	is	Empty	in	Java
import java.util.*;
public class IsEmpty {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        boolean val = s.isEmpty();
        if(val==true){
            System.out.println("Hey the string is empty");
        }
        else{
            System.out.println(s);
        }
    }

}

//output:
//
//        Hey the string is empty
//
//        Process finished with exit code 0