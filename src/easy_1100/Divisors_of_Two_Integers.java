package easy_1100;

import java.util.Arrays;
import java.util.Scanner;

public class Divisors_of_Two_Integers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int n1=a[n-1];
        for (int i=1;i<=n1;i++){
            if (n1%i==0){
                for (int j=0;j<n;j++){
                    if (a[j]==i){
                        a[j]=-1;
                        break;
                    }
                }
            }
        }
        int n2=1;
        for (int i:a)n2=Math.max(n2,i);
        System.out.println(n1+" "+n2);
    }
}
