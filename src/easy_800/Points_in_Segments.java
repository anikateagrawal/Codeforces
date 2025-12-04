package easy_800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Points_in_Segments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int p[]=new int[m+1];
        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            for (int j=l;j<=r;j++)p[j]++;
        }
        List<Integer> l=new ArrayList<>();
        for (int i=1;i<m+1;i++){
            if(p[i]==0)l.add(i);
        }
        System.out.println(l.size());
        for (int i:l) System.out.print(i+" ");
    }
}
