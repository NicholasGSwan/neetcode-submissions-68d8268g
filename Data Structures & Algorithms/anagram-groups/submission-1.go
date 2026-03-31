
func groupAnagrams(strs []string) [][]string {
    ans := make([][]string, 0)
    m := make(map[[26]int][]string)

    for _, v := range strs {
        var count [26]int
        for _, r := range v {
            count[r-'a']++
        }

        m[count] = append(m[count], v)
    }

    for _, v := range m {
        ans = append(ans, v)
    }


    return ans
}


