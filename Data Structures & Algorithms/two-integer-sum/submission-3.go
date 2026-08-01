func twoSum(nums []int, target int) []int {
    indexDigit := make(map[int]int)
	for i,digit := range nums{
		needNumber := target - digit
		if _,exists := indexDigit[needNumber];exists{
			return []int{indexDigit[needNumber],i}
		}
		indexDigit[digit] = i
	}
	return nil
}
