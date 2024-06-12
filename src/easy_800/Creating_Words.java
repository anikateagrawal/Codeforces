package easy_800;

import java.util.Scanner;

public class Creating_Words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            char a[]=sc.next().toCharArray();
            char b[]=sc.next().toCharArray();
            char tmp=a[0];
            a[0]=b[0];
            b[0]=tmp;
            System.out.print(new String(a)+" ");
            System.out.println(new String(b));
        }
    }
}
