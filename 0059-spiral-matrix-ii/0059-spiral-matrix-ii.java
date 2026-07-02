class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int num=1;
        int t=0,b=n-1;
        int l=0,r=n-1;
        while(l<=r && t<=b) {
            for(int i=l;i<=r;i++) {
                matrix[t][i]=num++;
            }
            t++;
            for(int i=t;i<=b;i++) {
                matrix[i][r]=num++;
            }
            r--;
            if(l<=r) {
                for(int i=r;i>=l;i--) {
                    matrix[b][i]=num++;
                }
                b--;
            }
            if(t<=b) {
                for(int i=b;i>=t;i--) {
                    matrix[i][l]=num++;
                }
                l++;
            }
        }
        return matrix;
    }
}