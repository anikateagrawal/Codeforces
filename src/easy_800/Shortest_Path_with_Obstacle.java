package easy_800;

import java.util.Scanner;

public class Shortest_Path_with_Obstacle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int dis=Math.abs(a-c)+Math.abs(b-d);
            int f=sc.nextInt();
            int g=sc.nextInt();
            if((a==c&&c==f)&&((b<g&&g<d)||(d<g&&g<b)))System.out.println(dis+2);
            else if((b==d&&d==g)&&((a<f&&f<c)||(c<f&&f<a))) System.out.println(dis+2);
            else
            System.out.println(dis);

        }
    }
}
