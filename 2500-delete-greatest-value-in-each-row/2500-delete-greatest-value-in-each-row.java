class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int l=0, r=grid[0].length-1, t=0, b=grid.length-1;

        for(int i=0;i<grid.length;i++){
            int row[] = grid[i];
            Arrays.sort(row);
        }
        int ans=0;
        while(l<=r){
            int max=0;
            for(int i=t;i<=b;i++){
                int curr=grid[i][l];
                max=Math.max(max,curr);
            }
            ans+=max;
            l++;
        }
        return ans;
    }
}