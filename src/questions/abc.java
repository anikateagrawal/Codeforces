package questions;

import java.io.*;
import java.util.Scanner;

public class abc {
    static  int sparsh = 20;
    int a= 10;
    {
        sparsh=50;
        System.out.println("block2");
    }
    static {
        System.out.println(sparsh);
        sparsh=100;
        System.out.println("Block");
    }
    {
        System.out.println("block3");
    }
    public abc(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Main");
        System.out.println(sparsh); //
        abc rudraksha= new abc();
        System.out.println(sparsh);
    }
}
