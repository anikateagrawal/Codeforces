package easy_800;

import java.util.Scanner;

public class Insomnia_cure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int l=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int d=sc.nextInt();
        boolean f[]=new boolean[d+1];
        for(int i=1;i*k<d+1;i++){
            f[i*k]=true;
        }
        for(int i=1;i*l<d+1;i++){
            f[i*l]=true;
        }
        for(int i=1;i*m<d+1;i++){
            f[i*m]=true;
        }
        for(int i=1;i*n<d+1;i++){
            f[i*n]=true;
        }
        int c=0;
        for(int i=1;i<d+1;i++){
            if(f[i])c++;
        }
        System.out.println(c);
    }
}
