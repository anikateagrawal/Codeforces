package div3;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            int f1[][]=new int[n+1][26];
            int f2[][]=new int[n+1][26];
            int fr[]=new int[26];
            for (int i=0;i<n;i++){
                fr[a.charAt(i)-'a']++;
                f1[i+1]= Arrays.copyOf(fr,26);
            }
            fr=new int[26];
            for (int i=0;i<n;i++){
                fr[b.charAt(i)-'a']++;
                f2[i+1]=Arrays.copyOf(fr,26);
            }
            while (q-->0){
                int l=sc.nextInt();
                int r=sc.nextInt();
                int c=0;

                int fl1[]=f1[l-1];
                int fr1[]=f1[r];
                int fq1[]=new int[26];
                for (int i=0;i<26;i++){
                    fq1[i]=fr1[i]-fl1[i];
                }

                int fl2[]=f2[l-1];
                int fr2[]=f2[r];
                int fq2[]=new int[26];
                for (int i=0;i<26;i++){
                    fq2[i]=fr2[i]-fl2[i];
                }

                for (int i=0;i<26;i++){
                    c+=Math.max(fq1[i]-fq2[i],0);
                }

                System.out.println(c);
            }
        }
    }
}
