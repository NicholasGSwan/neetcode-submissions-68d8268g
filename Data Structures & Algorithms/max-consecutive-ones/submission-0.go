func findMaxConsecutiveOnes(nums []int) int {
	L := 0
	R := 0
	max := 0

	for R < len(nums) && len(nums) - L >= max {
		if nums[R] == 1 {
			R++
		}else{
			tmp := R - L
			if tmp > max {
				max = tmp
			}
			R++
			L = R
		}
	}

	if R - L > max {
		return R-L
	}

	return max
	
}
