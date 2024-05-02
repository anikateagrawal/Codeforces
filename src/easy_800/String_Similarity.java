package easy_800;
//commit
import java.util.Scanner;

public class String_Similarity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int z=0;
            for (char ch:s.toCharArray())if(ch=='0')z++;
            String ans="";
            if(z>2*n-1-z)for (int i=0;i<n;i++)ans+="0";
            else for (int i=0;i<n;i++)ans+="1";
            System.out.println(ans);

        }
    }
}
