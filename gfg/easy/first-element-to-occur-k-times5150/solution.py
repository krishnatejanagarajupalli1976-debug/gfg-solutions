class Solution:
    def firstElementKTime(self, arr: list[int], k: int) -> int:
        # code here
        freq=[0]*1000001
        for i in range(len(arr)):
            freq[arr[i]]+=1
            if(freq[arr[i]]==k):
                return arr[i]
        return -1