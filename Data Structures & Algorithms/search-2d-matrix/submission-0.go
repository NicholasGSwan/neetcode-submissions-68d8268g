func searchMatrix(matrix [][]int, target int) bool {
    T, L := 0, 0
    B, R := len(matrix)-1, len(matrix[0])-1
    if target < matrix[T][L] || target > matrix[B][R]{
        return false;
    }
    M := (T + B) /2
    for T <= B {
        if target < matrix[M][L]{
            B = M-1
        }else if target> matrix[M][R]{
            T = M+1
        }else{
            break
        }
        M = (T+B)/2
    }

    for L <= R {
        HM := (L+R)/2
        if target == matrix[M][HM] {
            return true
        }else if target > matrix[M][HM]{
            L = HM+1
        }else{
            R = HM-1
        }
    }
    return false
}
