package easy_800;

import java.util.Scanner;

public class Manhattan_Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int r=-1,c=-1;int max=0;
            for (int i=0;i<n;i++){
                String s=sc.next();
                if(!s.contains("#"))continue;
                int st=s.indexOf("#"),e=s.lastIndexOf("#");
                int d=e-st+1;
                if(d>max){
                    r=i+1;
                    c=(st+e)/2+1;
                    max=d;
                }
            }
            System.out.println(r+" "+c);
        }
    }
}
