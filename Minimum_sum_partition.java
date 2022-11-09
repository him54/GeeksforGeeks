//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    int sum =0;
        for(int i: arr){
            sum = sum+i;
     }
     
     boolean[] prev = new boolean[sum + 1];
     prev[0] = true;
     for(int i = 1; i<=n; i++){
         boolean[] curr = new boolean[sum + 1];
         curr[0] = true;
         for(int j=1; j<=sum; j++){
             curr[j] = prev[j];
             if(arr[i-1] <= j)
             {
                 curr[j] = curr[j] || prev[j-arr[i-1]];
            }
         }
         prev = curr;
     }

     int min = sum;
     for(int i=0; i<=sum; i++){
         if(prev[i])
         {
             min = Math.min(min, Math.abs(sum-2*i));

         }
     }
     return min;
	} 
}
