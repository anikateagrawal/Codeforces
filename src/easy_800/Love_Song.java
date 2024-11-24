package easy_800;

import java.util.Scanner;

public class Love_Song {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int q=sc.nextInt();
        String s=sc.next();
        int f[]=new int[n+1];
        for (int i=0;i<n;i++){
            f[i+1]=f[i]+(s.charAt(i)-'a'+1);
        }
        while (q-->0){
            int l=sc.nextInt();
            int r= sc.nextInt();
            System.out.println(f[r]-f[l-1]);
        }
    }
}
