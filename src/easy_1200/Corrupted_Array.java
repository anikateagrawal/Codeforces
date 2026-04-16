package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Corrupted_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int b[]=new int[n+2];
            long total=0;
            for (int i=0;i<n+2;i++){
                b[i]=sc.nextInt();
                total+=b[i];
            }
            Arrays.sort(b);
            if (total-b[n+1]-b[n]==b[n]){
                for (int i=0;i<n;i++) System.out.print(b[i]+" ");
                System.out.println();
            }
            else {
                long sum=b[n+1];
                total-=b[n+1];
                boolean flag=false;
                for (int i=0;i<=n;i++){
                    if (total-b[i]==sum){
                        flag=true;
                        for (int j=0;j<=n;j++){
                            if (i==j)continue;
                            System.out.print(b[j]+" ");
                        }
                        System.out.println();
                        break;
                    }
                }
                if (!flag) System.out.println(-1);
            }

        }
    }
}
