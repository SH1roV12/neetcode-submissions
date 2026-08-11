func characterReplacement(s string, k int) int {
    someMap := make(map[rune]int)
    max := 0
    left := 0
    for right := 0; right < len(s);right++{
        windowSize := right-left + 1
        someMap[rune(s[right])]++
        if someMap[rune(s[right])] > max{
            max = someMap[rune(s[right])]
        }
        if windowSize-max > k{
            someMap[rune(s[left])]--
            left++
        }
    }
    return len(s) - left
}

