class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        
        firstWrd = 0
        secondWrd = 0
        answ = ""
        while(firstWrd != len(word1) or secondWrd != len(word2)):
            if firstWrd >= len(word1):
                answ+=word2[secondWrd]
                secondWrd+=1
                continue
            elif secondWrd >= len(word2):
                answ+=word1[firstWrd]
                firstWrd+=1
                continue
            answ+=word1[firstWrd]
            answ+=word2[secondWrd]
            firstWrd+=1
            secondWrd+=1
        return answ