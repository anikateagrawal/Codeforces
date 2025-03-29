package easy_900;

import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int v=1;
            int c=0;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a==v)v++;
                else c++;
            }
            System.out.println((c+k-1)/k);
        }
    }
}
