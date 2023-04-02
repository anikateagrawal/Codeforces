package easy_800;

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String h="I hate ";
        String il="I love ";
        String s="I hate ";
        for(int i=2;i<=n;i++){
            if(i%2==0){
                s+="that "+il;
            }
            else s+="that "+h;
        }
        s+="it";
        System.out.println(s);
    }
}
