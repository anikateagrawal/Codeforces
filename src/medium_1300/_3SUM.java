package medium_1300;

import java.util.Scanner;

public class _3SUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int [10];
            for (int i=0;i<n;i++)a[sc.nextInt()%10]++;
            boolean ans=false;

            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    for(int k=0;k<10;k++){
                        a[i]--;
                        a[j]--;
                        a[k]--;
                        if(a[i]>=0&&a[j]>=0&&a[k]>=0 && (i+j+k)%10==3)ans=true;
                        a[i]++;
                        a[j]++;
                        a[k]++;
                    }
                }
            }
            if(ans) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
