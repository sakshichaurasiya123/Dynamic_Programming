
// Using Recursion
int coingchange(int A[],int n,int sum){
if(sum==0)
return 1;
if(n==0)
 return 0;
int res=coinchange(A,n-1,sum );
if(A[n-1]<=sum){
res=res+coinchange(A,n,sum-A[n-1]);

}
return res;
}


//Using DP tabular form

public class Solution {
public int coinchange2(ArrayList<Integer> A, int B) {
    int m = 1000007;
    int n = A.size();
    int dp[] = new int[B+1];
    dp[0]=1;
    
    for(int i=0; i<n; i++){
        for(int j=A.get(i); j<=B; j++)
            dp[j] += dp[j-A.get(i)]%m;
    }
    
    return dp[B]%m;
}
}



