package easy_1100;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> zero=new ArrayList<>();
        ArrayList<Integer> pos=new ArrayList<>();
        for (int i=0;i<n;i++){
            int v=sc.nextInt();
            if(v<0)neg.add(v);
            else if(v>0)pos.add(v);
            else zero.add(v);
        }
        if(pos.size()==0){
            pos.add(neg.remove(0));
            pos.add(neg.remove(0));
        }
        if(neg.size()%2==0){
            zero.add(neg.remove(0));
        }
        System.out.print(neg.size()+" ");
        for (int i:neg) System.out.print(i+" ");
        System.out.println();
        System.out.print(pos.size()+" ");
        for (int i:pos) System.out.print(i+" ");
        System.out.println();
        System.out.print(zero.size()+" ");
        for (int i:zero) System.out.print(i+" ");
    }
}
