func productExceptSelf(nums []int) []int {
	someArr := make([]int, len(nums))
	for i := range nums{
		if i == 0{
			someArr[i] = 1
		}else{
			someArr[i] = someArr[i-1]*nums[i-1]
		}
		
	}
	
		for i := range nums{
			product := 1
			for j := i+1; j < len(nums); j++{
				product *= nums[j]
			}
			someArr[i] = someArr[i] * product
		
		}
		
	return someArr
	}