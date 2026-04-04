func lengthOfLongestSubstring(s string) int {
        set := make(map[byte]struct{})

		L := 0
		R := 0
        max := 0
		for R < len(s) {
            b := s[R]
            if _, ok := set[b]; ok{
                for L <= R && ok {
                    delete(set, s[L])
                    _, ok = set[b]
                    L++
                }
            }

            set[b] = struct{}{}
            R++
            max = maxInt(max, R-L)
		}
        return max
}

func maxInt(a, b int) int {
    if  a> b {
        return a
    }
    return b
}
