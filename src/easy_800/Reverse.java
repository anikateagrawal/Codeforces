package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int p[][]=new int[n][2];
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                p[i][0]=sc.nextInt();
                p[i][1]=i;
                a[i]=p[i][0];
            }
            Arrays.sort(p,(i1,i2)->i1[0]-i2[0]);
            int i1=0,i2=0;
            for (int i=0;i<n;i++){
                if (a[i]!=p[i][0]){
                    i2=p[i][1];
                    i1=i;
                    break;
                }
            }
            rev(a,i1,i2);
            for (int i=0;i<n;i++) System.out.print(a[i]+" ");
            System.out.println();
        }
    }
    static void rev(int a[],int s,int e){
        while (s<e) {
            int tmp = a[s];
            a[s] = a[e];
            a[e] = tmp;
            s++;
            e--;
        }
    }
}
