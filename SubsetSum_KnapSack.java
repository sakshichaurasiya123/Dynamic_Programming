public class Solution {
    public int solve(int[] A, int b) {
        int n=A.length;
       
        boolean dp[][]=new boolean[n+1][b+1];
        for(int i=1; i<=b; i++)
            dp[0][i]=false;
        for(int i=0; i<=n; i++)
            dp[i][0]=true;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=b; j++){
                if(A[i-1]<=j){
                    dp[i][j]=dp[i-1][j-A[i-1]] || dp[i-1][j];

                }
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
            if(dp[n][b])
                return 1;
            else
                return 0;
        
}

}
