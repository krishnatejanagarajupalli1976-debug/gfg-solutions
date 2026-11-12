class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int maxval=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>=maxval)
            {
                res.add(arr[i]);
                maxval=arr[i];
            }
        }
        Collections.reverse(res);
        return res;
        
    }
}
