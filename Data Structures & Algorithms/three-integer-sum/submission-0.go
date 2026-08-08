
func threeSum(nums []int) [][]int {
	sort.Ints(nums)
	arr := [][]int{}
	var left int
	var right int
	for i := 0; i < len(nums); i++{
		
		if i > 0 && nums[i] == nums[i-1] {
        	continue
    	}	
		firstDigit := nums[i]
		left = i+1
		right = len(nums) - 1
		target := -firstDigit
		for left < right{
			sum := nums[left] + nums[right]
			if sum < target{
				left++
				continue
			}
			if sum > target{
				right--
				continue
			}
			if sum == target{
				
				arr = append(arr, []int{nums[i],nums[left],nums[right]})

				for left < right && nums[left] == nums[left+1]{
					left++
				}
				for left < right && nums[right] == nums[right-1]{
					right--
				}
				left++
				right--
			}
		}
		
	}
	return arr
}



