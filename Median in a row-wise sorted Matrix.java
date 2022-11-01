//User function Template for Java
//Expected Time Complexity: O(32 * R * log(C))
//Expected Auxiliary Space: O(1)

class Solution {
    int median(int matrix[][], int R, int C) {
        int[]  arr = new int[R*C];
        int N = 0;
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                arr[N++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[arr.length/2];        
    }
}
