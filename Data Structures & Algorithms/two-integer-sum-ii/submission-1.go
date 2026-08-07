
func twoSum(numbers []int, target int) []int {
	i := 0
	j := len(numbers) - 1
	arr := []int{}
	for i < j{
		sum := numbers[i] + numbers[j]
		if sum > target{
			j--
			continue
		}else if sum < target{
			i++
			continue
		}

		arr = append(arr, i+1)
		arr = append(arr,j+1)
		break
		}
		return arr
	}
	
