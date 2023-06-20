package org.example;
import java.util.Scanner;
public class CheckPassFail {
     static void CheckPassFail(int mark){
        if(mark>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
    public static void main(String[] args) {
        int mark=60;
        CheckPassFail(mark);
    }
}