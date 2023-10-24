package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Blank_Space {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int c=0,max=0;
            for(int i=0;i<n;i++){
                if(a[i]==0)c++;
                else{
                    max=Math.max(max,c);
                    c=0;
                }
            }
            System.out.println(Math.max(max,c));
        }
    }
}
