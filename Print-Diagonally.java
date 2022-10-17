class Solution{
    static ArrayList<Integer> downwardDigonal(int N, int A[][])
    {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0; i<N; i++)
        {
            for(int j = 0; j<=i; j++){
                list.add(A[j][i-j]);
            }
        }
        for(int i = 1; i<=N-1; i++){
            for(int j = 0;j<N-i;j++){
                list.add(A[i+j][N-1-j]);
            }
        }
        return list;
    }
}
