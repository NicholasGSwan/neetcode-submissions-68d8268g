func findDuplicate(nums []int) int {
    set := make(map[int]struct{})
	for _, v := range nums {
		if _, ok := set[v]; ok{
			return v
		}
		set[v] = struct{}{}
	}
	return 0
}
