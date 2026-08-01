func isAnagram(s string, t string) bool {
	if len(s)!=len(t){
		return false
	}
	strMap := make(map[rune]int)
	for _,char := range s{
		_,exists := strMap[char]
		if exists{
			strMap[char]++
		}else {
			strMap[char] = 1
		}
	}
	for _,char := range t{
		_,exists := strMap[char]
		if exists{
			strMap[char]--
		}else{
			return false
		}
	}
	for _,count := range strMap{
		if count != 0{
			return false
		}
	}
	return true
}
