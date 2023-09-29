package medium_1300;

import java.util.Arrays;
import java.util.Scanner;

public class Pashmak_and_Flowers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int diff=a[n-1]-a[0];
        int min=1,max=1;
        for(int i=1;i<n;i++){
            if(a[i]==a[0])min++;
            else break;
        }
        for (int i=n-2;i>=0;i--){
            if(a[i]==a[n-1])max++;
            else break;
        }
        if(a[0]==a[n-1]) System.out.println(0+" "+1L*min*(min-1)/2);
        else
        System.out.println(diff+" "+1L*min*max);
    }
}
