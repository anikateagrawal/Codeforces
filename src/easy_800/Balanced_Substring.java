package easy_800;

import java.util.Scanner;

public class Balanced_Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            boolean f=false;
            for(int i=0;i<n-1;i++){
                if(s.charAt(i)!=s.charAt(i+1)){
                    f=true;
                    System.out.println((i+1)+" "+(i+2));
                    break;
                }
            }
            if(!f) System.out.println(-1+" -1");
        }
    }
}
