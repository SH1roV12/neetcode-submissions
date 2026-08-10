func lengthOfLongestSubstring(s string) int {
    someMap := make(map[rune]struct{})
    left := 0
    max := 0
    for right := 0; right < len(s);{
        if _,exists := someMap[rune(s[right])];exists{
            
            delete(someMap,rune(s[left]))
            left++
        }else{
            
            someMap[rune(s[right])] = struct{}{}
            if len(someMap) > max {
                max = len(someMap)
            }
            right++
        }
    }
    return max
}

