package easy_1100;

import java.util.Arrays;
import java.util.Scanner;

public class A_and_B_and_Compilation_Errors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n-1];
        int c[]=new int[n-2];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            b[i]=sc.nextInt();
        }
        for (int i = 0; i < n-2; i++) {
            c[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int n1=a[n-1];
        for (int i = 0; i < n-1; i++) {
            if(a[i]!=b[i]){
                n1=a[i];
                break;
            }
        }
        int n2=b[n-2];
        for (int i = 0; i < n-2; i++) {
            if(b[i]!=c[i]){
                n2=b[i];
                break;
            }
        }
        System.out.println(n1);
        System.out.println(n2);
    }
}
