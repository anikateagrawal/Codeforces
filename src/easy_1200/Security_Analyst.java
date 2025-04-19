package easy_1200;

import java.util.*;

public class Security_Analyst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong();
        long x=sc.nextLong();
        long a[]=new long[n];
        for (int i=0;i<n;i++)a[i]=sc.nextLong();
        Arrays.sort(a);
        List<Long> d=new ArrayList<>();
        int c=1;
        for (int i=0;i<n-1;i++){
            long diff=a[i+1]-a[i];
            if(diff>x){
                d.add(diff);
                c++;
            }
        }
        Collections.sort(d);
        int i=0;
        while (k>0&&c>1){
            long diff=d.get(i++);
            long r=diff/x;
            if(diff%x==0)r--;
//            System.out.println(diff+" "+k+" "+r);
            if(k>=r){
                k-=r;
                c--;
            }
            else break;
        }
        System.out.println(c);
    }
}
