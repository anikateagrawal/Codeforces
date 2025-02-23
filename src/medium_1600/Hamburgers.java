package medium_1600;

import java.util.Scanner;

public class Hamburgers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int q[]=new int [3];
        int p[]=new int[3];
        for (int i=0;i<3;i++)q[i]=sc.nextInt();
        for (int i=0;i<3;i++)p[i]=sc.nextInt();
        long r=sc.nextLong();

        int rq[]=new int[3];
        int cost=0;
        for (char ch:str.toCharArray()){
            int in=index(ch);
            cost+=p[in];
            rq[in]++;
        }
        int min=Integer.MAX_VALUE;
        for (int i=0;i<3;i++){
            if(rq[i]==0)continue;
            min=Math.min(min,q[i]/rq[i]);
        }

        long ans=min;
        for (int i=0;i<3;i++){
            q[i]-=min*rq[i];
        }

        outer:
        while ((rq[0]>0&&q[0]>0) || (rq[1]>0 && q[1]>0) || (rq[2]>0 && q[2]>0)){
            for(char ch:str.toCharArray()){
                int in=index(ch);
                if(q[in]>0){
                    q[in]--;
                }
                else if(p[in]<=r){
                    r-=p[in];
                }
                else break outer;
            }
            ans++;
        }

        System.out.println(ans+r/cost);
    }
    static int index(char ch){
        if(ch=='B')return 0;
        else if(ch=='S')return 1;
        else return 2;
    }
}
