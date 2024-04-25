package easy_800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Satisfying_Constraints {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int u=Integer.MAX_VALUE;
            int l=Integer.MIN_VALUE;
            List<Integer> c=new ArrayList<>();
            for (int i=0;i<n;i++){
                int aa=sc.nextInt();
                int x=sc.nextInt();
                if(aa==1)l=Math.max(l,x);
                else if(aa==2)u=Math.min(u,x);
                else c.add(x);
            }
            int p=u-l+1;
            for(int i:c)if(i>=l&&i<=u)p--;
            if(p<0)p=0;
            System.out.println(p);
        }
    }
}
