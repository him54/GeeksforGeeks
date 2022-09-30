
//Let Suppose there are two peoples one standing at first position and another person standing 2th position k = 1 then we have to skiped k - 1 peoples k- 1 will be zero
//so we have to kill the first person at last our answer will be two.


class Solution {
    static int safePos(int n, int k) {
        if(n == 1)
        {
            return 1;
        }
        return (safePos(n-1, k) + k-1) % n + 1; // Solve recursively
        
    }
};
