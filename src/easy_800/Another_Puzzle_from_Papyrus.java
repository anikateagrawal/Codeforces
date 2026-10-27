package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Another_Puzzle_from_Papyrus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int x1=0;
            int b[]=new int[n];
            for (int i=0;i<n;i++)b[i]=sc.nextInt();
            for (int i=0;i<n;i++){
                if (b[i]>a[i]){
                    x1=Integer.MAX_VALUE;
                    break;
                }
                x1+=a[i]-b[i];
            }
            if (x1<=c){
                System.out.println(x1);
                continue;
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int x2=c;
            for (int i=0;i<n;i++){
                if (b[i]>a[i]){
                    x2=Integer.MAX_VALUE;
                    break;
                }
                x2+=a[i]-b[i];
            }
            int ans=Math.min(x1,x2);
            System.out.println(ans==Integer.MAX_VALUE?-1:ans);
        }
    }
}
