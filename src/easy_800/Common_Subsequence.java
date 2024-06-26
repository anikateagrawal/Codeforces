package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Common_Subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            for (int i=0;i<n;i++)s.add(sc.nextInt());
            int ans=-1;
            for (int i=0;i<m;i++){
                int v=sc.nextInt();
                if(s.contains(v)){
                    ans=v;
                }
            }
            if(ans==-1) System.out.println("NO");
            else {
                System.out.println("YES");
                System.out.println(1+" "+ans);
            }
        }
    }
}
