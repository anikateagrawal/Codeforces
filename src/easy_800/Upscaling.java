package easy_800;

import java.util.Scanner;

public class Upscaling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s1="";String s2="";
            for (int i = 0; i < n; i++) {
                if(i%2==0){
                    s1+="##";s2+="..";
                }
                else {
                    s2+="##";
                    s1+="..";
                }
            }
            for (int i=0;i<n;i++){
                if(i%2==0) System.out.println(s1+"\n"+s1);
                else System.out.println(s2+"\n"+s2);
            }
        }
    }
}
