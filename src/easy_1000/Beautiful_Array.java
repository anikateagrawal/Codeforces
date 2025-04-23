package easy_1000;

import java.util.Scanner;

public class Beautiful_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long k=sc.nextInt();
            long b=sc.nextInt();
            long s=sc.nextLong();
            if(k==1){
                if(s==b) System.out.println(b);
                else System.out.println(-1);
            }
            else if(k*b>s) System.out.println(-1);
            else {
                s-=k*b;
                long d=(s+k-2)/(k-1);
                if(d>n) System.out.println(-1);
                else {
                    if(d==0)d++;
                    for (int i=0;i<n-d;i++) System.out.print(0+" ");
                    for (int i=1;i<d;i++) System.out.print((k-1)+" ");
                    System.out.println(k*b+((s-1)%(k-1)+1));
                }
            }
        }
    }
}
