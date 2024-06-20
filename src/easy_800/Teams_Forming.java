package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Teams_Forming {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int c=0;
        for (int i=0;i<n;i+=2){
            c+=a[i+1]-a[i];
        }
        System.out.println(c);
    }
}
