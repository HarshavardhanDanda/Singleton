package com.Company;

public class Singleton {
    private static Singleton obj;
    private Singleton(){

    }
    public static synchronized Singleton getObject(){
        if(obj == null){
            obj=new Singleton();
            System.out.println("a new object is created");
        }
        else{
            System.out.println("object is already created and getting reused again");
        }
        return obj;
    }

}
