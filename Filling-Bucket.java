class Solution {
    static int fillingBucket(int N) {
       int num1 = 1;
       int num2 = 1;
        for(int i = 2; i <= N; i++){
            int temp = (num1 + num2) % 100000000;
            num2 = num1;
            num1 = temp;
        }
        return num1;
    }
};
