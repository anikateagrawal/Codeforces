package easy_800;

import java.util.*;

public class Did_Not_Go_to_Print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            Stack<Integer> s = new Stack<>();
            List<Integer> l=new ArrayList<>();
            String str=sc.next();
            for (int i=1;i<=n;i++){
                char ch=str.charAt(i-1);
                if (ch=='1'){
                    s.add(i);
                }
                else if (ch=='2'){
                    if (!s.isEmpty()){
                        s.pop();
                        l.add(i);
                    }
                }
            }
            l.addAll(s);
            Collections.sort(l);
            System.out.println(l.size());
            for (int i:l) System.out.print(i+" ");
            System.out.println();
        }
    }
}
