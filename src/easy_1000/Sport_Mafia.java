package easy_1000;

import java.util.Scanner;

public class Sport_Mafia {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ans=-1;
        int l=0, r=n-1;
        while (l<=r){
            int mid=l+(r-l)/2;
            long rem=n-mid;
            long can=rem*(rem+1)/2 - mid;
            if (can==k){
                ans=mid;
                break;
            }
            else if (can>k){
                l=mid+1;
            }
            else r=mid-1;
        }
        System.out.println(ans);
    }
}
