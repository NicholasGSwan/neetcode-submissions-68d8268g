func replaceElements(arr []int) []int {
	maxItem := -1
	R := len(arr) -1
	for R >= 0 {
		if arr[R] > maxItem {
			temp := arr[R]
			arr[R] = maxItem
			maxItem = temp
		}else{
			arr[R] = maxItem
		}
		R--
	}
	return arr
}
