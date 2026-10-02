class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        someMap = set()
        l = 0
        r = 0
        while l <= r and r < len(nums):
            if r > k:
                someMap.remove(nums[l])
                l+=1
            if nums[r] in someMap:
                return True
            someMap.add(nums[r])
            r+=1
        return False