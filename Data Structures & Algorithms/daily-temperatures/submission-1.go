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

type stack struct {
    s []int
}

func (st *stack) push(n int) {
    st.s = append(st.s, n)
}

func(st *stack) isEmpty() bool{
    return len(st.s) == 0
}

func (st *stack) peek() int {
    if(len(st.s) > 0){
        return st.s[len(st.s)-1]
    }
    return 0
}

func(st *stack) pop() int {
    n := st.s[len(st.s)-1]
    //fmt.Println("Before pop: ", len(st.s))
    st.s = st.s[:len(st.s)-1]
    //fmt.Println("After pop: ", len(st.s))
    return n
}
