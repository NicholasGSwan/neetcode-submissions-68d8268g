func subsets(nums []int) [][]int {
    ans := make([][]int, 0)
    subset := make([]int, 0)
    var getSubset func(n int)
    getSubset = func(n int){
        if n >= len(nums){
            temp  := make([]int, len(subset))
            copy(temp, subset)
            ans = append(ans, temp)
            return
        }
        subset = append(subset, nums[n])
        getSubset(n+1)
        subset = subset[:len(subset)-1]
        getSubset(n+1)
    }
    getSubset(0)
    return ans

}

