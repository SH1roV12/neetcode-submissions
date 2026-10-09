class Solution:
    def scoreOfString(self, s: str) -> int:
        res = 0 
        i = 1
        while i < len(s):
                res += abs(ord(s[i]) - ord(s[i-1]))
                i+=1
        return res