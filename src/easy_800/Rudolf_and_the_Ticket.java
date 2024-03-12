package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Rudolf_and_the_Ticket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int l[]=new int[n];
            int r[]=new int[m];
            for (int i=0;i<n;i++)l[i]=sc.nextInt();
            for (int i=0;i<m;i++)r[i]=sc.nextInt();
            Arrays.sort(l);
            Arrays.sort(r);
            long w=0;
            for(int i=0;i<n;i++){
                int j=0;
                for(j=m-1;j>=0;j--){
                    if(l[i]+r[j]<=k){
                        break;
                    }
                }
                w+=j+1;
            }
            System.out.println(w);
        }
    }
}
