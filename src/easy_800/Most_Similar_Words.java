package easy_800;

import java.util.Scanner;

public class Most_Similar_Words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String a[]=new String[n];
            for(int i=0;i<n;i++)a[i]=sc.next();
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++)min=Math.min(min,diff(a[i],a[j]));
            }
            System.out.println(min);
        }
    }
    static int diff(String a,String b){
        int d=0;
        for(int i=0;i<a.length();i++){
            d+=Math.abs(a.charAt(i)-b.charAt(i));
        }
        return d;
    }
}
