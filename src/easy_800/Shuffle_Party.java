package easy_800;

import java.util.Scanner;

public class Shuffle_Party {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int ans=1;
            for (int i=1;i<32;i++){
                if(((1<<i)&n)>0)ans=1<<i;
            }
            System.out.println(ans);
        }
    }
}
