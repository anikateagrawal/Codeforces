package easy_800;

import java.util.Scanner;

public class Iskander_and_Drawings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int max=0;
            int c=0;
            for (int i=0;i<n;i++){
                if (s.charAt(i)=='#'){
                    c++;
                    max=Math.max(max,(c+1)/2);
                }
                else c=0;
            }
            System.out.println(max);
        }
    }
}
