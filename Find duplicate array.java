class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<n; i++)
        {
            arr[arr[i] % n] += n;
        }
        for(int i = 0; i<n; i++)
        {
            if(arr[i]/n >= 2)
            {
                list.add(i);
            }
        }
        if(list.size() == 0)
        {
            list.add(-1);
            return list;
        }
        return list;
    }
}
