class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i];
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
           hm.put(arr[i],i);
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(arr[i]!= nums[i])
            {
                count++;
                int idx = hm.get(arr[i]);
                swap(nums,i,idx);
                hm.put(nums[i],i);
                hm.put(nums[idx],idx);
            }
            
        }
        return count;
    }

    static void swap(int[] arr,int i,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
