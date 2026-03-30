func uniquePaths(m int, n int) int {
	prevRow := make([]int, n)

	for i := m -1; i > -1; i-- {
		currRow := make([]int, n)
		currRow[n-1] = 1

		for j := n -2; j > -1; j-- {
			currRow[j] = prevRow[j] + currRow[j+1]
		} 
		prevRow = currRow
	}
	return prevRow[0]
}


