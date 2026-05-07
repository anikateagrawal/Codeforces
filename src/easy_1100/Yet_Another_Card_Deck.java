package easy_1100;

import java.util.Scanner;

public class Yet_Another_Card_Deck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int a[]=new int[51];
        for (int i=0;i<n;i++){
            int c=sc.nextInt();
            if (a[c]==0)a[c]=i+1;
        }
        while (q-->0){
            int c=sc.nextInt();
            int p=a[c];
            System.out.print(p+" ");
            for (int i=0;i<51;i++){
                if (a[i]<p)a[i]++;
            }
            a[c]=1;
        }
    }
}
