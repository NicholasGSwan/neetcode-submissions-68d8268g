func search(nums []int, target int) int {
	L := 0
	R := len(nums)-1

	for L <=R {
		M := (L + R)/2
		if nums[M] < target{
			L = M+1
		}else if nums[M] > target{
			R = M-1
		}else if nums[M] == target{
			return M
		}
	}
	return -1
}
