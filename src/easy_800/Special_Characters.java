package easy_800;

import java.util.Scanner;

public class Special_Characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n%2==1) System.out.println("NO");
            else {
                System.out.println("YES");
                String s="";
                for(int i=0;i<n/2;i++){
                    s+="AAB";
                }
                System.out.println(s);
            }
        }
    }
}
