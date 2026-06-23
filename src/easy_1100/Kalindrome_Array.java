package easy_1100;

import java.util.Scanner;

public class Kalindrome_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int i=0,j=n-1;
            while (i<j && a[i]==a[j]){
                i++;
                j--;
            }
            if (i>=j) System.out.println("YES");
            else {
                if (check(a, a[i])||check(a,a[j])) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
    static boolean check(int a[],int v){
        int i=0,j=a.length-1;
        while (i<j){
            while (a[i]==v){
                i++;
            }
            while (a[j]==v){
                j--;
            }
            if (a[i]!=a[j])return false;
            i++;
            j--;
        }
        return true;
    }
}
