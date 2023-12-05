package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Friends_and_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        outer:
        while (t-->0){
            int n=sc.nextInt();
            int tot=0;
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                tot+=a[i];
            }
            int eq=tot/n;
            if(tot%n!=0){
                System.out.println("-1");
                continue;
            }
            int d=0;
            for(int i:a){
                d+=Math.max(eq-i,0);
            }
            if(d==0){
                System.out.println(0);
                continue ;
            }
            Arrays.sort(a);
            int sum=0;
            for(int i=n-1;i>=0;i--){
                sum+=a[i]-eq;
                if(sum>=d){
                    System.out.println(n-i);
                    continue outer;
                }
            }
        }
    }
}
