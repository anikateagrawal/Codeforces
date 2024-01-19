package easy_800;

import java.util.Scanner;

public class Three_Doors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int a[]=new int[3];
            for(int i=0;i<3;i++)a[i]=sc.nextInt();
            boolean flag=true;
            for(int i=0;i<2;i++){
                if(a[x-1]==0){
                    flag=false;
                    break;
                }
                x=a[x-1];
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
