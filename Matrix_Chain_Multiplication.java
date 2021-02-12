
class Solution{
    
    static int matrixMultiplication(int n, int arr[])
    {
      int dp[][]=new int[n][n];
      
        for(int i=0; i<n; i++)
            dp[i][i]=0;
        for(int l=2; l<n; l++){
            for(int i=1; i<n-l+1; i++){
                int j=i+l-1;
                if(j==n)
                    continue;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i; k<=j-1; k++){
                    int q=dp[i][k]+dp[k+1][j]+(arr[i-1]*arr[k]*arr[j]);
                    if(q<dp[i][j])
                        dp[i][j]=q;
                }
            }
        }
        return dp[1][n-1];
    }
}
