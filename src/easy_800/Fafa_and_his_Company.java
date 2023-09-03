package easy_800;

import java.util.Scanner;

public class Fafa_and_his_Company {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        for (int i = 1; i <n; i++) {
            if(n%i==0)f++;
        }
        System.out.println(f);
    }
}
