func productExceptSelf(nums []int) []int {
	someArr := make([]int, len(nums))
	for i := range nums{
		if i == 0{
			someArr[i] = 1
		}else{
			someArr[i] = someArr[i-1]*nums[i-1]
		}
		
	}
	product := 1

	for i := len(nums)-1;i >= 0; i -- {
		
		someArr[i] = someArr[i] * product
		product *= nums[i]
	}
	fmt.Println(someArr)
	return someArr
	}