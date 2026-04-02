import "slices"
func carFleet(target int, position []int, speed []int) int {
    mOfSpd := make(map[int]int)

    for i, v := range position {
        mOfSpd[v] = speed[i] 
    }

    st := &stack{}

    slices.Sort(position)

    for i := len(position)-1; i >=0; i-- {
        v := position[i]
        s := mOfSpd[v]
        if !st.isEmpty(){
            v2 := st.peek()
            s2 := mOfSpd[v2]
            if float32(target-v2)/float32(s2) < float32(target-v)/float32(s) {
                st.push(v)
            }
        }else {
            st.push(v)
        }
    }
    return st.Len()
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

func (st *stack) Len() int {
    arr := *st
    return len(arr)
}