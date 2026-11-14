class Solution {
    public boolean isStrong(int n) {
        // code here
        int dup=n;
        int rem=0;
        int fact=1;
        int sum=0;
        while(n!=0)
        {
            rem=n%10;
            fact=1;
            for(int i=rem;i>0;i--)
            {
                fact*=i;
            }
            sum+=fact;
            n=n/10;
        }
        return sum==dup;
    }
}