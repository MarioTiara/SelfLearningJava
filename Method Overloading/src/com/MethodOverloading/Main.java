package com.MethodOverloading;
import overloadingClass.ResponseOverloading;

public class Main{
    public static void main(String [] arg){
        
        System.out.println("main class");

        ResponseOverloading.response("data string");
        ResponseOverloading.response(5);
        ResponseOverloading.response(true);

    }
}