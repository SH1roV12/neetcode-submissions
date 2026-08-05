
func isValidSudoku(board [][]byte) bool {
	var row [9]map[byte]bool
	var column [9]map[byte]bool
	var square [9]map[byte]bool
	for i := 0; i < 9; i++ {
    	row[i] = make(map[byte]bool)
    	column[i] = make(map[byte]bool)
		square[i] = make(map[byte]bool)
	}
	for i := 0; i < 9; i++{
		for j := 0; j < 9; j++{
			char := board[i][j]
			if char == '.'{
				continue
			}
			squareIndex := (i/3)*3 + (j / 3)
			if row[i][char] || column[j][char] || square[squareIndex][char]{
				return false
			}
			row[i][char] = true
			column[j][char] = true
			square[squareIndex][char] = true
		}
	} 
	return true
}