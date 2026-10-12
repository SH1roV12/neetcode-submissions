class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        if num == 1:
            return True
        l = 0
        r = num//2
        mid = 0
        while l <= r:
                mid = l + ((r-l)//2)
                double = mid*mid
                if double == num:
                        return True
                if double > num:
                        r = mid-1
                else:
                        l = mid+1
        return False