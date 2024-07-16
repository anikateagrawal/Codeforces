package easy_800;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Restoring_the_Duration_of_Tasks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s[]=new int[n];
            int f[]=new int[n];
            for (int i=0;i<n;i++)s[i]=sc.nextInt();
            for (int i=0;i<n;i++)f[i]=sc.nextInt();
            int pr=0;
            for (int i=0;i<n;i++){
                System.out.print(f[i]-Math.max(pr,s[i])+" ");
                pr=f[i];
            }
            System.out.println();
        }
    }
}
