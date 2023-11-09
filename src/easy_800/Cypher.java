package easy_800;

import java.util.Scanner;

public class Cypher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            for(int i=0;i<n;i++){
                int b=sc.nextInt();
                String s=sc.next();
                for(char ch:s.toCharArray()){
                    if(ch=='D')a[i]++;
                    else a[i]--;
                    a[i]=(a[i]+10)%10;
                }
            }
            for(int i=0;i<n;i++) System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}
