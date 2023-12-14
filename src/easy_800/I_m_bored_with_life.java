package easy_800;

import java.util.Scanner;

public class I_m_bored_with_life {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int f=1;
        for(int i=1;i<=Math.min(a,b);i++){
            f*=i;
        }
        System.out.println(f);
    }
}
