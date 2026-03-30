func checkInclusion(s1 string, s2 string) bool {
    if len(s1) > len(s2) {
        return false
    }

    L := 0
	length := len(s1)
	for L + length <= len(s2){
		
		if checkSubString(s1, s2[L:L+length]){
			return true
		}
		L++
	}

	return false

}

func checkSubString(s1, s2 string) bool {
	counts := make(map[rune]int)
	for _, v := range(s2) {
        cnt, _ := counts[v]
        counts[v] = cnt + 1
    }
    for _, v := range(s1) {
        cnt, _ := counts[v]
        if cnt < 1 {
            return false
        } 
        counts[v] = cnt -1
    }
    return true
}
