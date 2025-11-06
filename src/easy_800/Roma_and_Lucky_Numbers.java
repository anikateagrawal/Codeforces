package easy_800;

import java.util.Scanner;

public class Roma_and_Lucky_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int c=0;
        for (int i=0;i<n;i++){
            int v=sc.nextInt();
            int l=count(""+v);
            if(l<=k)c++;
        }
        System.out.println(c);
    }
    static int count(String n){
        int c=0;
        for (char ch:n.toCharArray()){
            if(ch=='4'||ch=='7')c++;
        }
        return c;
    }
}
