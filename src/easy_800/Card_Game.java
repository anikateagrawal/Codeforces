package easy_800;

import java.util.Scanner;

public class Card_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a[]=new int[]{sc.nextInt(),sc.nextInt()};
            int b[]=new int[]{sc.nextInt(),sc.nextInt()};
            int ans=0;
            for(int i=0;i<2;i++){
                for (int j=0;j<2;j++){
                    if(a[i]>=b[j]&&a[1-i]>b[1-j]||a[i]>b[j]&&a[1-i]>=b[1-j])ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
