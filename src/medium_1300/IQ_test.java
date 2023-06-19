package medium_1300;

import java.util.Scanner;

public class IQ_test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int o=0,e=0;
        int odd=0,even=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                e++;
                even=i;
            }
            else{
                o++;
                odd=i;
            }
        }
        if(o==1) System.out.println(odd+1);
        else System.out.println(even+1);
    }
}
