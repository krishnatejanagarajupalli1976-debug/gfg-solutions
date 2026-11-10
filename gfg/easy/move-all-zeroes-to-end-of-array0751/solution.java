class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int count=0;
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[j]=arr[i];
                j++;
            }
            else
            {
                count++;
            }
        }
        while(count!=0)
        {
            arr[j]=0;
            j++;
            count--;
        }
    
    }
}