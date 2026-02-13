package easy_1000;

import java.util.Scanner;

public class Numbers_Box {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[][]=new int[n][m];
            int neg=0;
            int min=Integer.MAX_VALUE;
            int total=0;
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    a[i][j]=sc.nextInt();
                    if(a[i][j]<0){
                        neg++;
                        a[i][j]*=-1;
                    }
                    total+=a[i][j];
                    min=Math.min(min,a[i][j]);
                }
            }
            if(neg%2==1){
                total-=2*min;
            }
            System.out.println(total);
        }
    }
}
