package easy_900;

import java.util.Scanner;

public class Mark_the_Dust_Sweeper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long ans=0;int flag=0;
            for(int i=0;i<n;i++)
            {
                int g=sc.nextInt();
                if(g>0) flag=1;
                if(i<n-1 && flag==1)
                    ans+=(g==0?1:g);
            }
            System.out.println(ans);
        }
    }
}
