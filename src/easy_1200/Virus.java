package easy_1200;

import java.util.*;

public class Virus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[m];
            for (int i=0;i<m;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<m-1;i++)l.add(a[i+1]-a[i]-1);
            l.add(n-(a[m-1]-a[0]+1));
            Collections.sort(l,Collections.reverseOrder());
//            System.out.println(l);
            int ans=0;
            int c=0;
            for (int i:l){
                if (i>c*2){
                    int r=i-c*2;
                    if (r==1)ans++;
                    ans+=r-1;
                    c+=2;
                }
            }
            System.out.println(n-ans);
        }
    }
}
