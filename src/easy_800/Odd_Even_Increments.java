package easy_800;

import java.util.Scanner;

public class Odd_Even_Increments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            boolean ee=false,eo=false,oe=false,oo=false;
            for (int i=0;i<n;i++){
                int v=sc.nextInt();
                if(i%2==0){
                    if(v%2==0)ee=true;
                    else eo=true;
                }
                else{
                    if(v%2==0)oe=true;
                    else oo=true;
                }
            }
            if(ee&&eo||oe&&oo) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
