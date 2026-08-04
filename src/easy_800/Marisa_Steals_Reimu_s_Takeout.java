package easy_800;

import java.util.Scanner;

public class Marisa_Steals_Reimu_s_Takeout {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int z=0,o=0,tw=0;
            for (int i=0;i<n;i++){
                int w= sc.nextInt();
                if (w==0)z++;
                else if (w==1)o++;
                else tw++;
            }
            int m=Math.min(o,tw);
            int ans=z+m;
            o-=m;
            tw-=m;
            ans+=o/3+tw/3;
            System.out.println(ans);
        }
    }
}
