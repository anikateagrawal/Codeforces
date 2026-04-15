package other;

import java.util.*;

public class abc {
    int date;
    String name;
    B obj;

    public abc(int date, String name, B obj) {
        this.date = date;
        this.name = name;
        this.obj = obj;
    }

    public static void main(String[] args) {
        abc obj=new abc(10,"Anikate ", new B(10));
        
    }
}
class B{
    int a;
    public B(int age){
        a=age;
    }
}
