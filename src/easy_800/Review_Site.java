package easy_800;

import java.util.Scanner;

public class Review_Site {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int u=0;
            for(int i=0;i<n;i++){
                int v=sc.nextInt();
                if(v!=2)u++;
            }
            System.out.println(u);
        }
    }
}
