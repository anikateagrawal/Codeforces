package easy_800;

import java.util.Scanner;

public class Mostafa_Saad_Ibrahim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if((n/2)%2==1) System.out.println("NO");
            else{
                System.out.println("YES");
                int e=2;
                int o=1;
                int se=0;
                int so=0;
                for (int i = 0; i < n/2; i++) {
                    se+=e;
                    System.out.print(e+" ");
                    e+=2;
                }
                for (int i = 0; i < n/2-1; i++) {
                    so+=o;
                    System.out.print(o+" ");
                    o+=2;
                }
                System.out.println(se-so);
            }
        }
    }
}
