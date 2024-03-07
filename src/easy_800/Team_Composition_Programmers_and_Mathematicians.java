package easy_800;

import java.util.Scanner;

public class Team_Composition_Programmers_and_Mathematicians {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();int b=sc.nextInt();
            int min=Math.min(a,b);
            int max=Math.max(a,b);
            int ans=0;
            int lo=0,hi=min;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(max<3*mid){
                    hi=mid-1;
                    continue;
                }
                int rmin=min-mid;
                int rmax=max-3*mid;
                if(rmax>rmin){
                    lo=mid+1;
                    ans=Math.max(ans,mid+rmin/2);
                }
                else if(rmin>rmax){
                    hi=mid-1;
                    ans=Math.max(ans,mid+rmax/2);
                }
                else {
                    ans=Math.max(ans,mid+rmin/2);
                    break;
                }
            }
            System.out.println(ans);

        }
    }
}
