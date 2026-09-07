func checkInclusion(s1 string, s2 string) bool {
    var str1 [26]int
    for _, value := range s1{
        str1[value - 'a']++
    }
    var str2 [26]int
    left := 0
    for right := 0; right < len(s2);right++{
        str2[s2[right] - 'a']++
        if str1==str2{
                return true
            }
        if right >= len(s1)-1{
            str2[s2[left]-'a']--
            left++
            if str1==str2{
                return true
            }
        }
    }
    return false
}