class Complete{
    
    public static int maximizeSum (int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : arr)
        {
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        int sum = 0; 
        int curr = 0;
        for(int i = n-1; i>=0 ; i--)
        {
            curr = arr[i];
            if(hm.containsKey(curr) && hm.get(curr) > 0)
            {
                
                if(hm.containsKey(curr-1) && hm.get(curr-1) > 0)
                {
                    hm.put(curr-1, hm.get(curr-1)-1);
                }
 
                sum += curr;
                hm.put(curr, hm.get(curr)-1);
            }
        }
        
        return sum;
    }
}

