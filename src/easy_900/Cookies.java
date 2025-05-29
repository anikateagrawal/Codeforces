package easy_900;

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int e=0,o=0;
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0)e++;
            else o++;
        }
        if(o%2==1) System.out.println(o);
        else System.out.println(e);
    }
}
