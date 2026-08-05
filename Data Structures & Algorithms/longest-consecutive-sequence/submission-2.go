func longestConsecutive(nums []int) int {
	someSet := make(map[int]bool)
	for _,value := range nums{
		someSet[value] = true
	}
	var start int
	maxLength := 0
	for key := range someSet{
		if !someSet[key-1]{
			start = key
			length := 1
			for(someSet[start+1]){
				length++
				start++
				
			}
			if length > maxLength{
				maxLength = length
			}
		}
	}
	return maxLength
}


