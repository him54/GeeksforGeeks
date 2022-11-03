//User function Template for Java

class Solution {
    int removals(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int i=0;
        int j=0;
        int max = 0;
        
        while(j<n)
        {
            while(arr[j] - arr[i] > k)
            {
                i++;
            }
            j++;
             max = Math.max(max, j-i);
        }
        return n-max;
    }
}
