package easy_800;

import java.util.Scanner;

public class Ten_Words_of_Wisdom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=-1;
            int mx=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                if(a<=10&&b>mx){
                    mx=b;
                    x=i+1;
                }
            }
            System.out.println(x);
        }
    }
}
