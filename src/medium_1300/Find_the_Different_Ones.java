package medium_1300;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Find_the_Different_Ones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            TreeSet<Integer> m=new TreeSet<>();
            m.add(1);
            for (int i=1;i<n;i++){
                if(a[i]==a[i-1])continue;
                m.add(i+1);
            }
            int q=sc.nextInt();
            while (q-->0){
                int l=sc.nextInt();
                int r=sc.nextInt();
                Integer j=m.ceiling(l+1);
                if(j==null||j>r){
                    System.out.println(-1+" "+(-1));
                }
                else System.out.println(l+" "+j);
            }
            System.out.println();
        }
    }
}
