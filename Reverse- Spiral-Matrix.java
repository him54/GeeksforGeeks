TC- O(R * C)
//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        int [] arr = new int [R*C];

        int N = R*C-1;
        int top = 0;
        int left = 0;
        int bottom = R-1;
        int right = C-1;

        while(top <= bottom && left <= right)
        {
            for(int i=left; i<=right; i++)
            {
                arr[N--] = a[top][i];
            }
            top++;

            for(int i=top; i<=bottom; i++)
            {
                arr[N--] = a[i][right];
            }

            right--;

            if(top <= bottom)
            {
              for(int i=right;i>=left;i--)
              {
                arr[N--]=a[bottom][i];
  
              }
               bottom--;
            } 

                if(left<=right)
                {

                    for(int i=bottom; i>=top; i--)
                    {
                        arr[N--] = a[i][left];
                    }
                     left++;
                }

            }
            return arr;
         }
}
                   
