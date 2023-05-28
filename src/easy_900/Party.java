package easy_900;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        for(int i=1;i<=n;i++)a[i]=sc.nextInt();
        int max=0;
        for(int i=1;i<=n;i++){
            int p=a[i];
            int g=1;
            while(p!=-1){
                g++;
                p=a[p];
            }
            max=Math.max(max,g);
        }
        System.out.println(max);
    }
}
