
//Recursive Solution
int lcs(char a[],char b[],int m,int n,int dp[][]){
if(m==0 || n==0)
  return 0;
  if(a[m-1]==b[n-1])
      return 1+lcs(a,b,m-1,n-1,dp);
     else
   return Math.max((a,b,m-1,n,dp),(a,b,m,n-1,dp);
}

//DP Solution
public class Solution {
    public int solve(String A, String B) {
        char A1[]=A.toCharArray();
        char B1[]=B.toCharArray();
        int m=A1.length;
        int n=B1.length;
        int dp[][]=new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++)
                dp[i][j]=-1;
        }
        int result=subsequence(A1,B1,m,n,dp);
        
        return result;
    }
    public int subsequence(char []A,char[]B,int m,int n, int arr[][]){
        if(arr[m][n]!=-1)
            return arr[m][n];
        if(m==0 || n==0)
        arr[m][n] =0;
        else{
        if(A[m-1]==B[n-1])
            arr[m][n]=1+subsequence(A,B,m-1,n-1,arr);
        else
        arr[m][n]=Math.max(subsequence(A,B,m-1,n,arr),subsequence(A,B,m,n-1,arr));
        }
        return arr[m][n];
    }
}
