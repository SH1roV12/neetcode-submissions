class Solution:
    def mySqrt(self, x: int) -> int:
        l = 1
        r = x
        res = 0
        while l <= r:
                mid = l + ((r-l)//2)
                mbSqrt = mid * mid
                
                if mbSqrt > x:
                        r = mid - 1
                else:
                        l = mid + 1
                        res = mid
        return res