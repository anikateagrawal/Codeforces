package questions.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combination_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int candidates[]=new int[n];
        for (int i=0;i<n;i++)candidates[i]=sc.nextInt();
        List<List<Integer>> ans = combinationSum(candidates, target);
        for (List<Integer> k : ans){
            for (int i:k) System.out.print(i+" ");
            System.out.println();
        }
    }
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> list = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        int i = 0;
        rec(candidates, target, i);
        return res;
    }

    public static void rec(int[] arr, int sum, int i)
    {
        if(i == arr.length){
            if(sum == 0)
                res.add(new ArrayList<>(list));
            return;
        }
        if(arr[i] <= sum){
            list.add(arr[i]);
            sum -= arr[i];
            rec(arr, sum, i);
            list.remove(list.size()-1);
            sum += arr[i];
        }
        rec(arr, sum, i+1);
    }
}
