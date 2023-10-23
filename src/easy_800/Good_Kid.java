package easy_800;

import java.util.Scanner;

public class Good_Kid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int min=Integer.MAX_VALUE,mi=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]<min){
                    min=a[i];
                    mi=i;
                }
            }
            a[mi]++;
            int p=1;
            for(int i:a)p*=i;
            System.out.println(p);
        }
    }
}
