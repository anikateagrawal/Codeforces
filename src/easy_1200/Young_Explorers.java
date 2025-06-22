package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Young_Explorers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int e[]=new int[n];
            for (int i=0;i<n;i++)e[i]=sc.nextInt();
            Arrays.sort(e);
            int p=0;
            int g=0;
            for (int i=0;i<n;i++){
                p++;
                if(e[i]<=p){
                    g++;
                    p=0;
                }
            }
            System.out.println(g);
        }
    }
}
