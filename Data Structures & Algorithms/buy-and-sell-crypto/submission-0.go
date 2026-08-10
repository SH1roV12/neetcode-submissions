func maxProfit(prices []int) int {
    left := 0
    maxProfit := 0
    for right := 1; right < len(prices); right++{
        if prices[left] < prices[right]{
            profit := prices[right] - prices[left]
            if profit > maxProfit{
                maxProfit = profit
            }
        }else {
            left = right
        }
    }
    return maxProfit
}
