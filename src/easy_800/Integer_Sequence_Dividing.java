package easy_800;

import java.util.Scanner;

public class Integer_Sequence_Dividing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt()%4;
        if(n==1||n==2) System.out.println(1);
        else System.out.println(0);
    }
}
