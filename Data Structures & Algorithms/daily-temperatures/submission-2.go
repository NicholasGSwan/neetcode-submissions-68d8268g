func dailyTemperatures(temperatures []int) []int {
    ans := make([]int, len(temperatures))
    s := &stack{}

    for i, v :=  range temperatures {
        dec := 0
        for !s.isEmpty(){
            if s.peek() < v {
                dec++
                s.pop()
                for ans[i - dec] > 0 {
                    dec++
                }
                ans[i-dec] = dec
            }else{
                break
            }
        }
        s.push(v)
    }

    return ans

}

type stack []int


func (st *stack) push(n int) {
    *st = append(*st, n)
}

func(st *stack) isEmpty() bool{
    return len(*st) == 0
}

func (st *stack) peek() int {
    if(len(*st) > 0){
        arr := *st
        return arr[len(arr)-1]
    }
    return 0
}

func(st *stack) pop() int {
    l := len(*st)
    arr := *st
    n := arr[l-1]
    //fmt.Println("Before pop: ", len(st.s))
    *st = arr[:l-1]
    //fmt.Println("After pop: ", len(st.s))
    return n
}
