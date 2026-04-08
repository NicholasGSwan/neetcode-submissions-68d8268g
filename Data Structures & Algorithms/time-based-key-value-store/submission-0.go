type TimeMap struct {
    tm map[string][]pair

}
type pair struct {
	n	int
	s string
}

func Constructor() TimeMap {
    tm := make(map[string][]pair)
    t := TimeMap{tm:tm}
    return t
}

func (this *TimeMap) Set(key string, value string, timestamp int) {
	p := pair{n:timestamp, s:value}
    this.tm[key] = append(this.tm[key], p) 
}

func (this *TimeMap) Get(key string, timestamp int) string {
	p := this.tm[key]
	//fmt.Println(len(p))
    for i := len(p)-1; i > -1; i-- {
		//fmt.Println("the ts is ", p[i].n)
		if p[i].n <= timestamp{
			return p[i].s
		}
    }
    return ""
}

// func bs(bot, lim int, m map[int]string) {
// 	max := 0
// 	m := (lim + bot)  /2
// 	for bot<=lim {

// 	}
// }
