package easy_1000;

import java.util.Scanner;

public class Crafting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int b[]=new int[n];
            for (int i=0;i<n;i++)b[i]=sc.nextInt();
            int max=0;
            int mi=-1;
            for (int i=0;i<n;i++){
                int d=b[i]-a[i];
                if(d>max){
                    max=d;
                    mi=i;
                }
            }
            boolean flag=true;
            for (int i=0;i<n;i++){
                if(i==mi)continue;
                if(a[i]-max<b[i])flag=false;
            }

            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
