package easy_800;

import java.util.Scanner;

public class Two_Friends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int p[]=new int[n];
            for (int i=0;i<n;i++)p[i]=sc.nextInt();
            boolean found=false;
            for (int i=0;i<n;i++){
                if(p[p[i]-1]==i+1){
                    found=true;
                    break;
                }
            }
            if (found) System.out.println(2);
            else System.out.println(3);
        }
    }
}
