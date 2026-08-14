func minWindow(s string, t string) string {
    tMap := make(map[byte]int)
    need := 0
    for _,value := range t{
        if _,exists := tMap[byte(value)];!exists{
            need++
        }
        tMap[byte(value)]++
    }
    sMap := make(map[byte]int)
    have := 0
    left := 0
    // min := 0
    subString := ""
    for right := 0; right < len(s);right++{
        if _,exists := tMap[s[right]]; exists{
            sMap[s[right]]++
            tCount := tMap[s[right]]
            sCount := sMap[s[right]]
            if tCount == sCount{
                have++
            }
        }
        for have == need{
            window := s[left:right+1]
            if len(subString) == 0{
                subString=window
            }
            if len(window) < len(subString){
                subString = window
            }
        
                if _,exists := sMap[s[left]]; exists{
                    sMap[s[left]]--
                    tCount := tMap[s[left]]
                    sCount := sMap[s[left]]
                    if tCount > sCount{
                        have--
                    }
                    
                }
            left++
            
        }
    }
    return subString
}


