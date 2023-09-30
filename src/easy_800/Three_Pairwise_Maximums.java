package easy_800;

import java.util.Scanner;

public class Three_Pairwise_Maximums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int min=Math.min(x,Math.min(y,z));
            int max=Math.max(x,Math.max(y,z));
            if(x==y&&y==z) System.out.println("YES\n"+x+" "+y+" "+z);
            else{
                if(x==y&&y==max||y==z&&z==max||x==z&&z==max){
                    System.out.println("YES");
                    System.out.println(max+" "+min+" "+1);
                }
                else System.out.println("NO");
            }
        }
    }
}
