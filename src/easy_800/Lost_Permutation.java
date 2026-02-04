package easy_800;

import java.util.Scanner;

public class Lost_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int m=sc.nextInt();
            int s=sc.nextInt();
            int a[]=new int[m];
            int sum=0;
            for (int i=0;i<m;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            boolean flag=false;
            for (int i=1;i<1000;i++){
                int ap=i*(i+1)/2;
                int r=ap-sum;
                if(r==s){
                    flag=true;
                }
                else if(r>sum)break;
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
