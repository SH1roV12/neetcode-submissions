func isPalindrome(s string) bool {
	i := 0
	j := len(s) - 1
	for i < j{
		fmt.Println(i,j)
		for i < j && (!unicode.IsLetter(rune(s[i])) && !unicode.IsDigit(rune(s[i]))){
			i++
		}
		for i < j && (!unicode.IsLetter(rune(s[j])) && !unicode.IsDigit(rune(s[j]))){
			j--
		}

		if i >= j {
            break
        }


		if unicode.ToLower(rune(s[i])) != unicode.ToLower(rune(s[j])) {
			return false
		}
		i++
		j--
	}
	return true
}