class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                res.add(Math.max(arr[i],arr[j]));
                break;
            }
        }
        return res;
    }
};