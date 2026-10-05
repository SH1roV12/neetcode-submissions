class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        max = -1
        r = len(arr)-1
        while(r >= 0):
            thisDigit = arr[r]
            arr[r] = max
            r-=1
            if thisDigit > max:
                max = thisDigit
                continue
        return arr