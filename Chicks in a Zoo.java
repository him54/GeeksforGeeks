class Solution
{
    public long NoOfChicks(int N)
    {
        long[] dp = new long[N];
        Arrays.fill(dp, -1);
        dp[0]=1;

        for (int i = 1; i <N ; i++)
        {
            if(i < 6)
            {
                dp[i] = dp[i-1]*3;
            }
           else if(i == 6)
           {
             dp[i] = 3*dp[i-1]-3*dp[i-6];
           }
           else 
           {
               dp[i] = 3*dp[i-1] - 2*dp[i-6];
            }
        }
        return dp[N-1];
    }
}
        
