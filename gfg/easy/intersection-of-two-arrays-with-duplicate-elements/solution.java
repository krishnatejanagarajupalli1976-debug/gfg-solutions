class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        TreeSet<Integer> res=new TreeSet<>();
        ArrayList<Integer> res1=new ArrayList<>();
        Arrays.sort(b);
        for(int num:a)
        {
            int low=0;
            int high=b.length-1;
            boolean found=false;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(b[mid]==num)
                {
                    found=true;
                    break;
                }
                else if(b[mid]<num)
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