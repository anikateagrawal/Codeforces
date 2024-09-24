package easy_800;

import java.util.Scanner;

public class Robin_Helps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int c=0;
            int g=0;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a>=k)g+=a;
                if(a==0 && g>0){
                    c++;
                    g--;
                }
            }
            System.out.println(c);
        }
    }
}
