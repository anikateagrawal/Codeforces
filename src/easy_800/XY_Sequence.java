package easy_800;

import java.util.Scanner;

public class XY_Sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            long sum=0;
            int a=0;
            for (int i=0;i<n;i++){
                if(a+x>b){
                    a-=y;
                }
                else a+=x;
                sum+=a;
            }
            System.out.println(sum);
        }
    }
}
