
func twoSum(nums []int, target int) []int {
    m := make(map[int]int)
    
    for i, v := range nums{
        if h, ok := m[v]; ok {
            return []int{h, i}
        }
        m[target-v] = i
    }
    return []int{}
}
