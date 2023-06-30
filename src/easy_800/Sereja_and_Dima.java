package easy_800;

import java.util.Scanner;
import java.util.TreeSet;

public class Sereja_and_Dima {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int i=0,j=n-1;
        int sum=0;
        int s2=0;
        int tr=0;
        while(i<=j){
            tr++;
            if(a[i]>a[j]){
                if(tr%2==1)sum+=a[i];
                else s2+=a[i];
                i++;
            }
            else {
                if(tr%2==1)sum+=a[j];
                else s2+=a[j];
                j--;
            }
        }
        System.out.println(sum+" "+s2);
    }
}
