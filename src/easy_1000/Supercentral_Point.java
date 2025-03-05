package easy_1000;

import java.util.Scanner;

public class Supercentral_Point {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p[][]=new int[n][2];
        for (int i=0;i<n;i++){
            p[i][0]=sc.nextInt();
            p[i][1]=sc.nextInt();
        }
        int c=0;
        for (int i=0;i<n;i++){
            if(hasUpper(p,i) && hasLower(p,i) && hasLeft(p,i) && hasRight(p,i))c++;
        }
        System.out.println(c);
    }
    static boolean hasUpper(int p[][],int in){
        for (int i=0;i<p.length;i++){
            if(i==in)continue;
            if(p[i][0]==p[in][0] && p[i][1]>p[in][1])return true;
        }
        return false;
    }
    static boolean hasLower(int p[][],int in){
        for (int i=0;i<p.length;i++){
            if(i==in)continue;
            if(p[i][0]==p[in][0] && p[i][1]<p[in][1])return true;
        }
        return false;
    }
    static boolean hasLeft(int p[][],int in){
        for (int i=0;i<p.length;i++){
            if(i==in)continue;
            if(p[i][0]<p[in][0] && p[i][1]==p[in][1])return true;
        }
        return false;
    }
    static boolean hasRight(int p[][],int in){
        for (int i=0;i<p.length;i++){
            if(i==in)continue;
            if(p[i][0]>p[in][0] && p[i][1]==p[in][1])return true;
        }
        return false;
    }
}
