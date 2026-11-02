class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int count=0;
        int third_ele=Integer.MAX_VALUE;
        for(int nums:arr)
        {
            res.add(nums);
        }
        int size=res.size();
        Collections.sort(res);
        for(int ele:res)
        {
            if(res.size()<3) third_ele=-1;
            else if(count==res.size()-3)
            {
                third_ele=ele;
                break;
            }
            count++;
            
        }
        return third_ele;
        
        
    }
}