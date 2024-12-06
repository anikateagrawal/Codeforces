package easy_800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tanya_and_Stairways {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=1;
        int p=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for (int i=1;i<n;i++){
            int c=sc.nextInt();
            if(c<=p){
                s++;
                l.add(p);
            }
            p=c;
        }
        l.add(p);
        System.out.println(s);
        for (int i:l) System.out.print(i+" ");
        System.out.println();
    }
}
