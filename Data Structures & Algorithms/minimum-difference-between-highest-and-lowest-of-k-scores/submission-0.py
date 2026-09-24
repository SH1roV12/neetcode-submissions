class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        if len(nums) == 1:
            return 0
        nums.sort()
        l = 0
        r = k-1
        min = nums[len(nums)-1]
        while(r < len(nums)):
            
            diff = nums[r] - nums[l]
            if diff < min:
                min = diff
            l+=1
            r+=1
        return min