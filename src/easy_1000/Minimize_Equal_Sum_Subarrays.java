package easy_1000;

import java.util.*;

public class Minimize_Equal_Sum_Subarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<n;i++)l.add(sc.nextInt());
            Collections.rotate(l,1);
            for (int i:l) System.out.print(i+" ");
            System.out.println();
        }
    }
}
