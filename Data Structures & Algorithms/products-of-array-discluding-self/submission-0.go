func productExceptSelf(nums []int) []int {
    fw := make([]int, len(nums))
    bw := make([]int, len(nums))
    for i := range fw {
        fw[i] = 1
        bw[i] = 1
    }

    for i := 1; i <len(nums); i++{
        fw[i] = nums[i-1] * fw[i-1]
    }
    for i := len(nums) -2; i > -1; i-- {
        bw[i] = nums[i+1] * bw[i+1]
    }

    for i := range fw{
        fw[i] = fw[i]*bw[i]
    }
    return fw


}
