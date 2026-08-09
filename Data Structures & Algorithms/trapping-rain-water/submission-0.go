func trap(height []int) int {
	left := 0
	right := len(height) - 1
	total := 0
	maxL := 0
	maxR := 0
	for left < right {
        if height[left] < height[right] {
            if height[left] >= maxL {
                maxL = height[left]
            } else {
                total += maxL - height[left]
            }
            left++
        } else { 
            if height[right] >= maxR {
                maxR = height[right]
            } else {
                total += maxR - height[right]
            }
            right--
        }
    }
	return  total
}

