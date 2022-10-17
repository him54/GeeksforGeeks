class Solution {
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
       ArrayList<Integer> list = new ArrayList<>();
       TreeSet<Integer> set = new TreeSet<>();

        for(int i = n-1; i>=0; i--)
        {
            set.add(arr[i]);
            list.add(set.higher(arr[i]) == null ? -1 : set.higher(arr[i]));
        }
        Collections.reverse(list);
        return list;
    }
}
     
