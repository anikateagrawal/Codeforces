package easy_1200;

import java.util.Scanner;

public class Contrast_Value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int c=1;int p=0;
            for (int i=0;i<n-1;i++){
                if(a[i+1]>a[i]){
                    if(p==1)continue;
                    p=1;
                    c++;
                }
                else if(a[i+1]<a[i]){
                    if(p==-1)continue;;
                    p=-1;
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
