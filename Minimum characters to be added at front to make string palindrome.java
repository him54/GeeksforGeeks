//TC- O(N)
class Solution {
    public static int minChar(String str) {
      
       char[] arr = new char[str.length()];
       int left = 0;
       int right = str.length()-1;
       int temp = right;
       int count = 0;

        while(left<right)
       {
         if(str.charAt(left)==str.charAt(right))
         {
            left++;
            right--;

         }
         else
         {
            count++;
            left = 0;
            temp--;
            right = temp;
         }

        }
         return count;
    }
}
