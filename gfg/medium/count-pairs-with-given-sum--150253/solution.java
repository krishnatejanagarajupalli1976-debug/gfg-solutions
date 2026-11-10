class Solution {
    int countPairs(int arr[], int target) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int required=target-arr[i];
            count+=map.getOrDefault(required,0);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}