class alphanumeric {
    public String name;
    public int count;
    alphanumeric(String name, int count) {
        this.name = name;
        this.count = count;
    }
};
class Solution {
    alphanumeric[] sortedStrings(int N, String A[]) {
        TreeMap<String, Integer> hm = new TreeMap<>();
        for(String str : A)
        {
            hm.put(str, hm.getOrDefault(str, 0)+1);
        }
        alphanumeric[] res = new alphanumeric[hm.size()];
        int i = 0;
        for(String str : hm.keySet())
        {
            res[i] = new alphanumeric(str, hm.get(str));
            i++;
        }
        return res;
    }
};
