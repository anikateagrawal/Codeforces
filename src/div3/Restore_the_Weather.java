package div3;

import java.util.*;

public class Restore_the_Weather {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            List<int[]> l=new ArrayList<>();
            for (int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                l.add(new int[]{a[i],i});
            }
            Collections.sort(l,(i1,i2)->i1[0]-i2[0]);
            for (int i = 0; i <n ; i++) {
                b[i]=sc.nextInt();
            }
            Arrays.sort(b);
            int in=0;
            int ans[]=new int[n];
            for(int c[]:l){
                ans[c[1]]=b[in++];
            }
            for(int i:ans)
            System.out.print(i+" ");
            System.out.println();

        }
    }
}
