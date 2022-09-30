TC - O(N) 
class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int x : a)
        {
            if(map.containsKey(x))
            {
                map.put(x, map.get(x) + 1);
                if(map.get(x) == k)
                {
                    return x;
                }
            }
            else{
                map.put(x, 1);
                if(map.get(x) == k)
                {
                    return x;
                }
            }
            
        }
        return -1;
    } 
}
