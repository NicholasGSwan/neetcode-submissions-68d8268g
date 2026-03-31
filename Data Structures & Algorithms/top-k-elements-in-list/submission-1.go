func topKFrequent(nums []int, k int) []int {
    m := make(map[int]int)

    for _, v := range nums{
        m[v]++
    }
    s := make([][]int, 1000)


    for key, v := range m {
        s[v] = append(s[v], key)
    }
    ans := make([]int, 0)

    r := len(s) -1

    for k > 0 {
        if len(s[r]) > 0{
            ans = append(ans, s[r]...)
            k = k-len(s[r])
        }
        r--
    }
    return ans

}
