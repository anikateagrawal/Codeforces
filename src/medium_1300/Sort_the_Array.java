package medium_1300;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_the_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        Arrays.sort(b);
        int i=-1,j=-1;
        for(int k=0;k<n-1;k++){
            if(a[k]>a[k+1]){
                if(i==-1)i=k;
                j=k+1;
            }
        }
        if(i==-1){
            i=0;j=0;
        }
        rev(a,i,j);
//        System.out.println(i+" "+j+" "+Arrays.toString(a));
        for (int k = 0; k < n; k++) {
            if(a[k]!=b[k]){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
        System.out.println(i+1+" "+(j+1));
    }
    static void rev(int a[],int i,int j){
        while(i<j){
            int tmp=a[i];
            a[i]=a[j];
            a[j]=tmp;
            i++;j--;
        }
    }
}
