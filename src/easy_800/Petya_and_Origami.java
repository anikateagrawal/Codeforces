package easy_800;

import java.util.Scanner;

public class Petya_and_Origami {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ans=(2*n+k-1)/k;
        ans+=(5*n+k-1)/k;
        ans+=(8*n+k-1)/k;
        System.out.println(ans);
    }
}
