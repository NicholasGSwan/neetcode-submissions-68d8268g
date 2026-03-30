import "slices"
func longestConsecutive(nums []int) int {
    if len(nums) < 2 {
        return len(nums)
    }
    ans := 0
    slices.Sort(nums)
    cnt := 1
    prev := 0
    for i, v := range(nums){
        if i == 0 || prev == v {
            prev = v
            continue
        }
        if v == prev + 1 {
            cnt++
            prev = v
        }else{
            if cnt > ans {
                ans = cnt
            }
            cnt = 1
            prev = v
        }
    }
    if cnt > ans{
        return cnt
    }
    return ans
}
