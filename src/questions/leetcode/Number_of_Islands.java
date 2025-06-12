package questions.leetcode;

import java.util.Scanner;

public class Number_of_Islands {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int grid[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        System.out.println(numIslands(grid));
    }
    public static int numIslands(int[][] grid) {
        int cnt =0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    cnt++;
                    cleargrid(grid,i,j);
                }
            }
        }
        return cnt;
    }
    public static void cleargrid(int [][] grid,int i,int j)
    {
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0)
            return ;
        grid[i][j]=0;
        cleargrid(grid,i+1,j);
        cleargrid(grid,i,j+1);
        cleargrid(grid,i-1,j);
        cleargrid(grid,i,j-1);
    }
}
