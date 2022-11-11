//User function Template for Java

class Solution {
    int remove_duplicate(int A[],int N){
        if(A.length == 0){
            return 0;
        }
        int i = 0;
        for(int j = 0; j<A.length; j++) {
            if(A[j] != A[i]){
                i++;
                A[i] = A[j];
            }
        }
        return i+1;
    }
}
