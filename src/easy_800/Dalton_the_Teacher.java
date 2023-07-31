package easy_800;

import java.util.Scanner;

public class Dalton_the_Teacher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c=0;
            for(int i=1;i<=n;i++){
                if(sc.nextInt()==i)c++;
            }
            System.out.println((c+1)/2);
        }
    }
}
