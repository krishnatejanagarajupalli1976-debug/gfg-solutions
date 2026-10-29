class Solution {
    public int findK(int[][] mat, int k) {
        // code here
        int[] res=new int[mat.length*mat[0].length];
        int rowstart=0,rowend=mat.length-1;
        int colstart=0,colend=mat[0].length-1;
        //int count=0;
        int j=0;
        while(rowstart<=rowend && colstart<=colend)
        {
            for(int i=colstart;i<=colend;i++)
            {
                res[j]=mat[rowstart][i];
                j++;
            }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++)
            {
                res[j]=mat[i][colend];
                j++;
            }
            colend--;
            if(rowstart<=rowend)
            {
            for(int i=colend;i>=colstart;i--)
            {
                res[j]=mat[rowend][i];
                j++;
            }
            rowend--;
            }
            if(colstart<=colend)
            {
            for(int i=rowend;i>=rowstart;i--)
            {
                res[j]=mat[i][colstart];
                j++;
            }
            colstart++;
            }
        }
        return res[k-1];
    }
}