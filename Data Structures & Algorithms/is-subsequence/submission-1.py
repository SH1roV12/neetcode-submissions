class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        strPointer = 0
        subStrPointer = 0
        while (strPointer != len(t) and subStrPointer != len(s)):
            if t[strPointer] == s[subStrPointer]:
                strPointer+=1
                subStrPointer+=1
            else:
                strPointer+=1
            
                if strPointer >= len(t):
                    return False
        return subStrPointer == len(s)
    

