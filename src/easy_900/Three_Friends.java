package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Three_Friends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while (q-->0){
            int a[]=new int[3];
            for (int i=0;i<3;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            if (a[0]==a[1]&& a[1]==a[2]){
                System.out.println(0);
                continue;
            }
            else if(a[0]==a[1]){
                a[0]++;
                a[1]++;
            } else if(a[1]==a[2]){
                a[1]--;
                a[2]--;
            }

            if(a[0]<a[1])a[0]++;
            if(a[2]>a[1])a[2]--;
            System.out.println(a[1]-a[0]+a[2]-a[1]+a[2]-a[0]);
        }
    }
}
