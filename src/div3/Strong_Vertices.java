package div3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Strong_Vertices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]= sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i]=sc.nextInt();
            }
            long m=Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                m=Math.max(m,a[i]-b[i]);
            }
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(m==a[i]-b[i])l.add(i+1);
            }
            System.out.println(l.size());
            for(int i:l) System.out.print(i+" ");
            System.out.println();
        }
    }
}
