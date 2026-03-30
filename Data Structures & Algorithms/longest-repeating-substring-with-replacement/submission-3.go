

func characterReplacement(s string, k int) int {

	maxLen := 0
	L := 0
	R := L
	cnts := make(map[byte]int)
	maxVal := 0

	for R < len(s) {
		
		v, _ := cnts[s[R]]
		v = v+1
		cnts[s[R]] =  v
		R ++
		if v > maxVal{
			maxVal = v
		}
		win := R - L
		if win - maxVal > k{

			v, _ := cnts[s[L]]
			cnts[s[L]] = v -1
			L++
		}else if win > maxLen{
				maxLen = win
			}

	}

	if R-L > maxLen{
		maxLen = R-L
	}



	return maxLen
}

func getMaxVal(m map[byte]int) int {
	max := 0
	for _, v := range m{
		if v > max{
			max =v
		}
	}
	return max
}
