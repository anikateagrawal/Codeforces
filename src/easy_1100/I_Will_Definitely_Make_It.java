package easy_1100;

import java.util.Arrays;
import java.util.Scanner;

public class I_Will_Definitely_Make_It {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt()-1;
            int a[][]=new int[n][2];
            int max=0;
            for (int i=0;i<n;i++){
                a[i][0]=sc.nextInt();
                a[i][1]=i;
                max=Math.max(max,a[i][0]);
            }
            Arrays.sort(a,(i1,i2)->i1[0]-i2[0]);
            int in=-1;
            for(int i=0;i<n;i++){
                if(a[i][1]==k)in=i;
            }

            boolean flag=true;
            int w=0;
            for (int i=in;i<n-1;i++){
                if(w+(a[i+1][0]-a[i][0])<=a[i][0]){
                    w+=a[i+1][0]-a[i][0];
                }
                else {
                    flag=false;break;
                }
//                System.out.println(w+" "+a[i][0]+" "+a[i][1]);
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
