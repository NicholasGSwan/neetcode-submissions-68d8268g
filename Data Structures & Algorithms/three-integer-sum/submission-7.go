import "slices"
func threeSum(nums []int) [][]int {
	slices.Sort(nums)
	
	
	ans := make([][]int, 0)
	

	for i := 0; i < len(nums) -2; i++ {
		a:= nums[i]
		if i > 0 && nums[i] == nums[i-1]{
			continue
		}
        L, R := i+1, len(nums) - 1

        for L < R {
            sum := a + nums[L] + nums[R]
            if sum < 0 {
                L++
            }else if sum > 0 {
                R--
            }else{
                tmp := []int{a, nums[L], nums[R]}
                ans = append(ans, tmp)
                L++
                for L < R && nums[L] == nums[L -1]{
                    L++
                }
            }
        }
	}

	return ans
}
