package easy_1000;

import java.util.Scanner;

public class Triangles_on_a_Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int w=sc.nextInt();
            int h=sc.nextInt();
            long ans=0;
            int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            int k=sc.nextInt();
            for (int i=0;i<k;i++){
                int v=sc.nextInt();
                min=Math.min(min,v);
                max=Math.max(max,v);
                ans=Math.max(ans,1L*(max-min)*h);
            }
            min=Integer.MAX_VALUE;max=Integer.MIN_VALUE;
            k=sc.nextInt();
            for (int i=0;i<k;i++){
                int v=sc.nextInt();
                min=Math.min(min,v);
                max=Math.max(max,v);
                ans=Math.max(ans,1L*(max-min)*h);
            }
            min=Integer.MAX_VALUE;max=Integer.MIN_VALUE;
            k=sc.nextInt();
            for (int i=0;i<k;i++){
                int v=sc.nextInt();
                min=Math.min(min,v);
                max=Math.max(max,v);
                ans=Math.max(ans,1L*(max-min)*w);
            }
            min=Integer.MAX_VALUE;max=Integer.MIN_VALUE;
            k=sc.nextInt();
            for (int i=0;i<k;i++){
                int v=sc.nextInt();
                min=Math.min(min,v);
                max=Math.max(max,v);
                ans=Math.max(ans,1L*(max-min)*w);
            }
            System.out.println(ans);
        }
    }
}
