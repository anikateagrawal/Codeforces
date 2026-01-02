package easy_800;

import java.util.Scanner;

public class Little_C_Loves_3_I {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1,b=1,c=n-2;
        if(c%3==0){
            c--;b++;
        }
        System.out.println(a+" "+b+" "+c);
    }
}
