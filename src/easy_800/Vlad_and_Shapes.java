package easy_800;

import java.util.Scanner;

public class Vlad_and_Shapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int r[]=new int[n];
            for(int i=0;i<n;i++){
                String s=sc.next();
                int ss=0;
                for(char ch:s.toCharArray()){
                    ss+=ch-'0';
                }
                r[i]=ss;
            }
            boolean f=true;
            for(int i=0;i<n;i++){
                if(i+1<n&&r[i]>0&&r[i]==r[i+1]){
                    f=false;break;
                }
            }
            if(f) System.out.println("TRIANGLE");
            else System.out.println("SQUARE");
        }
    }
}
