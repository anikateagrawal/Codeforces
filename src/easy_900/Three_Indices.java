package easy_900;

import java.util.Scanner;

public class Three_Indices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int rmin[]=new int[n];
            int min=Integer.MAX_VALUE;
            int mi=-1;
            for (int i=n-1;i>=0;i--){
                if(a[i]<=min){
                    min=a[i];
                    mi=i;
                }
                rmin[i]=mi;
            }
            boolean flag=false;
            min=Integer.MAX_VALUE;
            mi=-1;
            for (int i=0;i<n;i++){
                if(a[i]<=min){
                    min=a[i];
                    mi=i;
                }
                if(mi!=i && rmin[i]!=i){
                    flag=true;
                    System.out.println("YES");
                    System.out.println((mi+1)+" "+(i+1)+" "+(rmin[i]+1));
                    break;
                }
            }
            if(!flag) System.out.println("NO");
        }
    }
}
