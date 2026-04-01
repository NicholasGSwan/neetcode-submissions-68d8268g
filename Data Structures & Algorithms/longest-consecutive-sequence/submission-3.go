
func longestConsecutive(nums []int) int {
    set := make(map[int]struct{})

    for _, v:= range nums {
        set[v] = struct{}{}
    }

    max := 0

    for _, v := range nums {
        
        if _, ok := set[v-1]; !ok{
            i := 0
            _, ok1 := set[v]
            for ok1{
                i++
                _, ok1 = set[v+i]
            }
            max = maxInt(max, i)
        }
    }

    return max
}

func maxInt(a, b int) int {
    if a > b {
        return a
    }else{
        return b
    }
}
