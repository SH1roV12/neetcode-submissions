func maxSlidingWindow(nums []int, k int) []int {
    deque := []int{}
    someArr := []int{}
    left := 0
    for right := 0; right < len(nums);right++{
        for len(deque) > 0 && deque[len(deque)-1] < nums[right]{
            deque = deque[:len(deque)-1]
        }
        
        deque = append(deque, nums[right])
        // fmt.Println(deque)
        if right >= k-1{
            
            if right-k >= 0 && deque[0] == nums[right-k]{
                deque = deque[1:]
            }
            someArr = append(someArr, deque[0])
            left++
        }
    }
    
    return someArr
}