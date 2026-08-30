package easy_900;

import java.util.Scanner;

public class Evanescent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int ans=1;int r=0;
            for (int i=1;i<n-1;i++){
                if (s.charAt(i)==s.charAt(i-1))continue;
                ans++;
                if (s.charAt(i+1)==s.charAt(i-1)){
                    r=2;
                }
                if (s.charAt(i+1)!=s.charAt(i)){
                    r=Math.max(r,1);
                }
            }
            if (s.charAt(n-1)!=s.charAt(n-2))ans++;
            System.out.println(ans-r);
        }
    }
}
