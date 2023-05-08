package easy_900;

import java.util.Scanner;

public class Kefa_and_First_Steps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for (int i=0;i<t;i++)a[i]=sc.nextInt();
        int c=1;int max=1;
        for (int i = 1; i < t; i++) {
            if(a[i]>=a[i-1]){
                c++;
                max=Math.max(max,c);
            }
            else {
                c=1;
            }
        }
        System.out.println(max);
    }
}
