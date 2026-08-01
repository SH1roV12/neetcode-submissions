func hasDuplicate(nums []int) bool {
    numsSet := make(map[int]struct{})
	for _,num := range nums{
		fmt.Println(num)
		_,exists := numsSet[num]
		numsSet[num] = struct{}{}
		if exists{
			return true
		}
	}
	return false
}
