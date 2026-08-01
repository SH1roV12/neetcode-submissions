func hasDuplicate(nums []int) bool {
    numsSet := make(map[int]struct{})
	for _,num := range nums{
		fmt.Println(num)
		_,exists := numsSet[num]
		if exists{
			return true
		}
		numsSet[num] = struct{}{}
	}
	return false
}
