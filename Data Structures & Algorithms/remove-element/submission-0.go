func removeElement(nums []int, val int) int {
    R := len(nums) - 1
	
	for R > -1 && nums[R] == val {
		R--
	}

	L := R - 1
	for  L >= 0 {
		if nums[L] == val {
			nums[L] = nums[R]
			nums[R] = val
			for nums[R] == val {
				R--
			}
		}
		L--
	}
	return R + 1
}
