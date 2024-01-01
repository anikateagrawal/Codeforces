package easy_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Mahmoud_and_a_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        boolean flag=false;
        for(int i=0;i<n-2;i++){
            int s1=a[i];
            int s2=a[i+1];
            int s3=a[i+2];
            if((s1+s2>s3)&&(s1+s3>s2)&&(s2+s3>s1)){
                flag=true;
                break;
            }
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
