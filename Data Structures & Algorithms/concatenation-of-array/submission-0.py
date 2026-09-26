class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        someArr = [0] * (len(nums)*2)
        for i in range(len(nums)):
            someArr[i] = nums[i]
        for i in range(len(nums)):
            someArr[i+len(nums)] = nums[i]
        return someArr
