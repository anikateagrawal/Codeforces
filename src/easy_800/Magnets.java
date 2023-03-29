package easy_800;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=1;int pr=sc.nextInt();
        for (int i = 1; i < n; i++) {
            int a=sc.nextInt();
            if(a!=pr){
                ans++;
                pr=a;
            }
        }
        System.out.println(ans);
    }
}

