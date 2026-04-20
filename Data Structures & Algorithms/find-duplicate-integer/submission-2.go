func findDuplicate(nums []int) int {
	for _, v := range nums {
		if v < 0 {
			v = v*-1
		}
		
		if nums[v-1] < 0 {
			return v
		}
		nv := nums[v-1] * -1
		nums[v-1] = nv
	}
	return 0
}
