package easy_1000;

import java.util.Scanner;

public class Seats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0)
        {
            int n=in.nextInt();
            String s=in.next();
            int cnt=0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='1')i++;
                else
                {
                    if(i+1<n && s.charAt(i+1)=='1')
                    {
                        continue;
                    }
                    else
                    {
                        i+=(i+2<n && s.charAt(i+2)=='0')?2:1;
                    }
                }
                cnt++;
            }

            System.out.println(cnt);
        }
    }
}
