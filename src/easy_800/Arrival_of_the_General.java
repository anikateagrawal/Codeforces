package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int mini=0,min=a[0];
        int maxi=0,max=a[0];
        for (int i = 0; i < n; i++) {
            if(a[i]<=min){
                min=a[i];
                mini=i;
            }
            if(a[i]>max){
                max=a[i];
                maxi=i;
            }
        }
        int c=0;
        if(mini!=n-1)
        for (int i = mini; i < n-1; i++) {
            if(a[i]<a[i+1]){
                c++;
                int tmp=a[i];
                a[i]=a[i+1];
                a[i+1]=tmp;
            }
        }
        if(maxi!=0)
        for(int i=maxi;i>0;i--){
            if(a[i]>a[i-1]){
                c++;
                int tmp=a[i];
                a[i]=a[i-1];
                a[i-1]=tmp;
            }
        }
        System.out.println(c);
    }
}
