class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        if m == 0:
                for i in range(len(nums1)-1):
                        nums1[i] = nums2[i]
        endPointer = len(nums1)-1
        nums1Pointer = len(nums1) - n - 1
        nums2Pointer = len(nums2) - 1
        while nums1Pointer >= 0 or nums2Pointer >= 0:
                print(nums1Pointer)
                if nums2Pointer < 0 or (nums1Pointer >= 0 and nums1[nums1Pointer] >= nums2[nums2Pointer]):
                        nums1[endPointer] = nums1[nums1Pointer]
                        nums1Pointer-=1
                else:
                        nums1[endPointer] = nums2[nums2Pointer]
                        nums2Pointer-=1
                endPointer-=1
