class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        HashSet<Integer> res=new HashSet<>();
        ArrayList<Integer> res1=new ArrayList<>();
        Arrays.sort(a);
        for(int num:b)
        {
            int low=0;
            int high=a.length-1;
            boolean found=false;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(a[mid]==num)
                {
                    found=true;
                    break;
                }
                else if(a[mid]<num)
                {
                   low=mid+1; 
                }
                else{
                    high=mid-1;
                }
            }
            if(found)
            {
                res.add(num);
                
            }
        }
            for(int num1:res)
            {
                res1.add(num1);
            }
        
        return res1;
        
    }
}