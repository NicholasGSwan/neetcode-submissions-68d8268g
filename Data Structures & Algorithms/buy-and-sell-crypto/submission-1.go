func maxProfit(prices []int) int {
	L := 0
	R := 1
	max := 0
	for R < len(prices) {
		if prices[L] > prices[R] {
			L = R
		}	else{
			max = maxInt(prices[R] - prices[L], max)
		}
		R++
	}
	return max
}

func maxInt(a,b int) int {
	if a >b {
		return a
	}
	return b
}