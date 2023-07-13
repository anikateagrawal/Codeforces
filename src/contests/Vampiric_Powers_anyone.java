package contests;

import java.util.HashSet;
import java.util.Scanner;

public class Vampiric_Powers_anyone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            HashSet<Integer> s=new HashSet<>();
            s.add(0);
            int ans=0;
            int x=0;
            for (int i = 0; i < n; i++) {
                x=x^a[i];
                for(int j:s){
                    ans=Math.max(ans,x^j);
                }
                s.add(x);
            }
            System.out.println(ans);
        }
    }
}
