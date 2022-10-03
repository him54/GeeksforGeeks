class Solution {
    public int[] longestCommonPrefix(String s1, String s2){
        int[] arr = new int[2];
        char[] ch = new char[s1.length()];
        int n = s1.length();
        
        for(int i = 1; i<n; i++){
            if(s2.contains(s1.substring(0,i))){
                arr[0] = 0;
                arr[1] = i-1;
            }
        }
        return arr;
    }
}
