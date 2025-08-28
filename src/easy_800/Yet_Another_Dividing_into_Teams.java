package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Yet_Another_Dividing_into_Teams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            boolean flag=false;
            for (int i=0;i<n-1;i++){
                if(a[i+1]-a[i]==1)flag=true;
            }
            if (flag) System.out.println(2);
            else System.out.println(1);
        }
    }
}
