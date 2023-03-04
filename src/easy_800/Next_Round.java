package easy_800;

import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int kth=a[k-1];
        int c=0;
        for (int i = 0; i < n; i++) {
            if(a[i]<1)break;
            if(a[i]<kth)break;
            c++;
        }
        System.out.println(c);
    }
}
