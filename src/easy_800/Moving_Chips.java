package easy_800;

import java.util.Scanner;

public class Moving_Chips {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int f=-1,l=-1;
            int c=0;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a==1){
                    if(f==-1)f=i;
                    l=i;
                    c++;
                }
            }
            System.out.println(l-f-c+1);
        }
    }
}
