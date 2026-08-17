func dailyTemperatures(temperatures []int) []int {
    res := []int{}
    stack := []int{}
    
    for i := 0; i < len(temperatures);i++{
        res = append(res, 0)
        if len(stack) == 0{
            stack = append(stack, i)
            continue
        }
        for len(stack) > 0 && temperatures[i] > temperatures[stack[len(stack)-1]]{
            res[stack[len(stack)-1]] = i - stack[len(stack)-1]
            stack = stack[:len(stack)-1]
        }
        stack = append(stack, i)
    }
    return res
}
