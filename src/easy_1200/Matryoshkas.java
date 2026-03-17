package easy_1200;

import java.util.*;

public class Matryoshkas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int ans=0;
            int p=0;
            int c=1;
            for (int i=1;i<n;i++){
                if(a[i]==a[i-1]){
                    c++;
                }
                else if(a[i]==a[i-1]+1){
                    if(c>p) ans+=c-p;
                    p=c;
                    c=1;
                }
                else {
                    if(c>p)ans+=c-p;
                    p=0;
                    c=1;
                }
            }
            if (c>p)ans+=c-p;
            System.out.println(ans);
        }
    }
}
