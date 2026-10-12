class Solution:
    def arrangeCoins(self, n: int) -> int:
        l = 1
        r = n
        ans = 0
        mid = 0
        while l <= r:
                mid = l + ((r - l)//2)
                needCoins = (mid*(mid+1))/2
                if needCoins <= n:
                        l = mid+1
                        ans = mid
                else:
                        r = mid-1
        return ans