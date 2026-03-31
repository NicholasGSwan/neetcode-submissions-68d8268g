func maxSlidingWindow(nums []int, k int) []int {
	
	ans := make([]int, 0)
    deq := &deque{}
    for _, v := range nums[:k] {
        deq.addElement(v)
    }
    ans = append(ans, deq.getFirstElement())
    L := 1

    for L+k  <= len(nums){
        if nums[L-1] == deq.getFirstElement(){
            deq.removeFirstElement()
        }
        deq.addElement(nums[L+k-1])
        ans = append(ans, deq.getFirstElement())
        L++
    }
	

    

	return ans
}

type deque struct{
    dq []int
}

func (d *deque) addElement(n int) {
    i := len(d.dq) -1
    for i > -1  && d.dq[i] < n{
        d.removeLastElement()
        i--
    }

    d.dq = append(d.dq, n)

}

func (d *deque) removeLastElement(){
    if len(d.dq)> 0 {
        d.dq = d.dq[:len(d.dq)-1]
    }
}

func (d *deque) getFirstElement() int {
    return d.dq[0]
}

func (d *deque) removeFirstElement(){
    d.dq = d.dq[1:]
}
