package easy_900;

import java.util.*;

public class Good_Arrays {
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
            long sum1=0,sum2=0;
            for (int i=0;i<n;i++){
                if(a[i]==1){
                    sum2+=2;
                }
                else sum2+=1;
                sum1+=a[i];
            }
            if(sum2<=sum1&&n>1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
