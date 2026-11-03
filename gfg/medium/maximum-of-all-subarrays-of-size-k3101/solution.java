class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            maxi=Integer.max(maxi,arr[i]);
        }
        res.add(maxi);
        for(int i=k;i<arr.length;i++)
        {
            if(arr[i]>maxi)
            {
                maxi=arr[i];
            }
            else if(arr[i-k]==maxi)
            {
                maxi=Integer.MIN_VALUE;
                for(int j=i-k+1;j<=i;j++)
                {
                    maxi=Math.max(maxi,arr[j]);
                }
        }
                        res.add(maxi);

        }
        
        return res;
    }
}