package easy_1000;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Choose_the_Different_Ones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            Set<Integer> a=new HashSet<>();
            for (int i=0;i<n;i++)a.add(sc.nextInt());
            Set<Integer> b=new HashSet<>();
            for (int i=0;i<m;i++)b.add(sc.nextInt());
            int both=0;
            int ca=0,cb=0;
            boolean flag=true;
            for (int i=1;i<=k;i++){
                if(a.contains(i)&&b.contains(i))both++;
                else if(a.contains(i))ca++;
                else if(b.contains(i))cb++;
                else {
                    flag=false;
                    break;
                }
            }
            if(!flag) System.out.println("NO");
            else {
                if(ca>k/2||cb>k/2) System.out.println("NO");
                else System.out.println("YES");
            }
        }
    }
}
