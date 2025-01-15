package easy_1000;

import java.util.Scanner;

public class Dima_and_Friends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for (int i=0;i<n;i++)s+=sc.nextInt();
        int w=0;
        for (int i=1;i<6;i++){
            if(!((s+i)%(n+1)==1))w++;
        }
        System.out.println(w);
    }
}
