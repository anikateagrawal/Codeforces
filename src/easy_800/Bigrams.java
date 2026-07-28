package easy_800;

import java.util.Scanner;

public class Bigrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int k=sc.nextInt();
            int a[]=new int[k];
            boolean fl=false;
            int two=0;
            for (int i=0;i<k;i++){
                a[i]=sc.nextInt();
                if (a[i]>2)fl=true;
                else if (a[i]==2)two++;
                if (two>1)fl=true;
            }
            if (fl) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
