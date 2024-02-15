package medium_1400;

import java.util.Arrays;
import java.util.Scanner;

public class Exams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        Arrays.sort(a,(i1,i2)->i1[0]!=i2[0]?i1[0]-i2[0]:i1[1]-i2[1]);
        int ans=a[0][1];
        for(int i=1;i<n;i++){
            if(a[i][1]<ans)ans=a[i][0];
            else ans=a[i][1];
        }
        System.out.println(ans);
    }
}
