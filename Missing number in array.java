/* So whenever we have questions sach as missing number we can probably think about using XOR 
   becoz in x-ray we have this intersting property such as a*b*c..z = XOR1 a*b*c..y = XOR2 
   XOR1 * XOR2 =z
*/ 
// TC-O(N)
class Solution {
    int MissingNumber(int array[], int n) {
        int xor1 = 0;
        int xor2 = 0;
        
        for(int i = 0; i<array.length; i++)
        {
            xor1 ^= array[i];
        }
        for(int i = 1; i<=n; i++)
        {
            xor2 ^= i;
        }
        return xor1^xor2;
        
    }
}
