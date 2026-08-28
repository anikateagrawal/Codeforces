package easy_800;

import java.util.Scanner;

public class Card_Trick {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int m=sc.nextInt();
            int b[]=new int[m];
            for (int i=0;i<m;i++)b[i]=sc.nextInt();
            int in=0;
            for (int i:b){
                in= (in+i)%n;
            }
            System.out.println(a[in]);
        }
    }
}
