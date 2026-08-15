func isValid(s string) bool {
    someStack := []rune{}
    for _, value := range s{
        
        if value == '{' || value == '(' || value == '['{
            someStack = append(someStack, value)
        }else{
            if len(someStack) == 0{
                return false
            }
            stackHead := someStack[len(someStack)-1]
            if (stackHead == '{' && value == '}') || (stackHead == '(' && value == ')') || (stackHead == '[' && value == ']'){
                someStack = someStack[:len(someStack)-1]
            }else{
                return false
            }
        }
    }
    
    if len(someStack) != 0{
        return false
    }
    return true
}
