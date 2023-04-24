package div3;

import java.util.Scanner;

public class TubeTube_Feed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int tt=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            for (int i = 0; i < n; i++) {
                b[i]=sc.nextInt();
            }
            int max=-1;
            int mi=-1;
            for(int i=0;i<n;i++){
                if(a[i]+i<=tt){
                    if(b[i]>max){
                        max=b[i];
                        mi=i;
                    }
                }
//                System.out.println(a[i]+" "+i);
            }
            if(mi==-1) System.out.println(-1);
            else
            System.out.println(mi+1);
        }
    }
}
