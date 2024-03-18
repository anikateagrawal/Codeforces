package easy_1000;

import java.util.Scanner;

public class Petr_and_Book {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[7];
        int s=0;
        for(int i=0;i<7;i++){
            a[i]=sc.nextInt();
            s+=a[i];
        }
        n=n%s;
        if(n==0)n=s;
        for(int i=0;i<7;i++){
            if(n<=a[i]) {
                System.out.println(i+1);break;
            }
            else n-=a[i];
        }
    }
}
