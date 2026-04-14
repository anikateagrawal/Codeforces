package other;

import java.util.*;

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0) {
            int c=sc.nextInt();
            int m=sc.nextInt();
            int x=sc.nextInt();
            int ans=0;
            int left=1,right=Math.min(c,m);
            while (left<=right){
                int t=left+(right-left)/2;
                int cod=t;
                int mat=t;
                int r=c+m+x-cod-mat;
                if (r>=t){
                    ans=t;
                    left=t+1;
                }
                else right=t-1;
            }
            System.out.println(ans);
        }
    }
}
