class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int[] nums = new int[k];
        for(int i = 0; i < arr.length - k + 1; i++)
        {
            nums = Arrays.copyOfRange(arr, i, i + k);
            list.add(maxElement(nums));
        }
        return list;
    }
    private static int maxElement(int []nums){
        int max = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
