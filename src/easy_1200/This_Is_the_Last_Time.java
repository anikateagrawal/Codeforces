package easy_1200;


import java.util.Arrays;
import java.util.Scanner;

public class This_Is_the_Last_Time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[][]=new int[n][3];
            for (int i=0;i<n;i++){
                a[i][0]=sc.nextInt();
                a[i][1]=sc.nextInt();
                a[i][2]=sc.nextInt();
            }
            Arrays.sort(a,(i1,i2)->i1[0]-i2[0]);
            for (int i[]:a){
                if (i[0]<=k && i[2]>=k){
                    k=i[2];
                }
            }
            System.out.println(k);
        }
    }
}
