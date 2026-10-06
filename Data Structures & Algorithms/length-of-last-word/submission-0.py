class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        r = len(s)-1
        counter = 0
        while r >= 0:
                
                if s[r]==" ":
                        if counter == 0:
                                r-=1
                                continue
                        else:
                                break
                counter+=1
                r-=1
        return counter