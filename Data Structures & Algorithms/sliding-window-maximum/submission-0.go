func maxSlidingWindow(nums []int, k int) []int {
	currMax := scanForMax(nums[:k])
	ans := make([]int, 0)
	ans = append(ans, currMax)
	fmt.Println(currMax)
	L := 1;
	for  L+k  <= len(nums) {
		
		if nums[L+k-1] >= currMax{
			currMax = nums[L+k-1]
		} else if nums[L-1] == currMax {
			currMax = scanForMax(nums[L:L+k])
		}
		ans = append(ans, currMax)
		L++
	}
    

	return ans
}

func scanForMax(nums []int) int {
	max := -10001
	for _, v := range nums {
		if v > max {
			max = v
		}
	}
	return max
}
