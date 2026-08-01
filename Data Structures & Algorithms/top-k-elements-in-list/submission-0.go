func topKFrequent(nums []int, k int) []int {
	someMap := make(map[int]int)
	for _,i := range nums{
		someMap[i]++
	}
	countDigit := make([][]int,len(nums)+1)
	for digit,count := range someMap{
		countDigit[count] = append(countDigit[count], digit)
	}
	result := []int{}
	for i := len(countDigit) - 1; i >= 0; i--{
		if len(countDigit[i]) > 0{
			for _,digit  := range countDigit[i]{
				result = append(result,digit)
				if len(result) == k{
					return result
				}
			}
		}
	}
	return result
}
