type Solution struct{}

func (s *Solution) Encode(strs []string) string {
	
	var str string
	for _,value := range strs{
		str += fmt.Sprintf("%d:%s",len(value),value)
	}
	
	return str
}

func (s *Solution) Decode(encoded string) []string {
	strs := []string{}
	i := 0
	for(i < len(encoded)-1){
		// digitChar := encoded[i]
		var digitChar string

		j := i
		for(encoded[j] != ':'){
			j++
		}
		digitChar = encoded[i:j]
		
		length,_ := strconv.Atoi(digitChar)
		

		word := encoded[j+1:j+1+length]
		
		strs = append(strs,word)

		i = j +  1 + length
		
	}
	
	return strs
}
