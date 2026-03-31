type Solution struct{}

const delim = "#"

func (s *Solution) Encode(strs []string) string {
    encStr := ""
    
    for _, v := range(strs){
        encStr += fmt.Sprintf("%d%s%s",len(v), delim, v)
    }
    return encStr
}

func (s *Solution) Decode(encoded string) []string {
    ans := make([]string, 0);
    L := 0
    R := L
    
    for R < len(encoded){
        for encoded[R] != delim[0] {
            R++
        }
        l, _ := strconv.Atoi(encoded[L:R])
       
        L = R+1
        ans = append(ans, encoded[L: L+l])
        L = L+l
        R = L 
    }

    return ans
}
