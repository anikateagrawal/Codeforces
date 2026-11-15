package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class USB_Flash_Drives {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int c=0;
        for (int i=n-1;i>=0;i--){
            m-=a[i];
            c++;
            if (m<=0)break;
        }
        System.out.println(c);
    }
}
