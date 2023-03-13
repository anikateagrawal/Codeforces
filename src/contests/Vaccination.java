package contests;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Vaccination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int d=sc.nextInt();
            int w=sc.nextInt();
            int v=0;
            int res=0;
            int s=1;
            for (int i = 0; i < n; i++) {
                int tt=sc.nextInt();
                if(v==0 || s<=tt){
                    res++;
                    v=k-1;
                    s=tt+w+d+1;
                }
                else v--;
            }
            System.out.println(res);
        }
    }
}
