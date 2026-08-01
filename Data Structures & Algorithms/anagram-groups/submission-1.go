func groupAnagrams(strs []string) [][]string {
	arr := make(map[string][]string)
	for _,value := range strs{
		byteArr := []byte(value)
		sort.Slice(byteArr, func(i, j int) bool {return byteArr[i] < byteArr[j]})
		key := string(byteArr)
		if _,exists := arr[key];exists{
			arr[key] = append(arr[key], value)
		}else{
			arr[key] = []string{value}
		}
	}
	annogrammArrays := [][]string{}
	for _,array := range arr{
		annogrammArrays = append(annogrammArrays,array)
	}
	return annogrammArrays
}
