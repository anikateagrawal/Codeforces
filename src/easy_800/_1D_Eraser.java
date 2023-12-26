package easy_800;

import java.util.Scanner;

public class _1D_Eraser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();int k=sc.nextInt();
            int m=0;
            String s=sc.next();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='B'){
                    i+=k-1;
                    m++;
                }
            }
            System.out.println(m);
        }
    }
}
