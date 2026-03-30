type Solution struct{}

const inbetween = "{INBETWEENSTRINGS}"

func (s *Solution) Encode(strs []string) string {
    encStr := ""
    
    for _, v := range(strs){
        encStr += v + inbetween
    }
    return encStr
}

func (s *Solution) Decode(encoded string) []string {
    ans := strings.Split(encoded, inbetween)
    ans = ans[:len(ans) - 1]
    return ans
}
