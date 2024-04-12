package easy_800;

import java.util.Scanner;

public class We_Got_Everything_Covered {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s="";
            for(int i=0;i<n;i++){
                for(int j=0;j<k;j++){
                    s+=(char)('a'+j);
                }
            }
            System.out.println(s);
        }
    }
}
