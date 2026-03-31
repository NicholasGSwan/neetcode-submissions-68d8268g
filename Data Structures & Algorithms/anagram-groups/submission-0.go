import "slices"
func groupAnagrams(strs []string) [][]string {
    ans := make([][]string, 0)
    m := make(map[string][]string)

    for _, v := range strs {
        m[sortString(v)] = append(m[sortString(v)], v)
    }

    for _, v := range m {
        ans = append(ans, v)
    }


    return ans
}

func sortString(s string) string {
    b := []byte(s)
    slices.Sort(b)
    return string(b)
}
