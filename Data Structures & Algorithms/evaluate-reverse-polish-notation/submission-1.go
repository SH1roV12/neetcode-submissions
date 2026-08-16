func evalRPN(tokens []string) int {
    someStack := []int{}
    for _,value := range tokens{
        if value == "+" || value == "-"  ||  value == "*" || value == "/"{
            apperand2 := someStack[len(someStack)-1]
            someStack = someStack[:len(someStack)-1]
            apperand1 := someStack[len(someStack)-1]
            someStack = someStack[:len(someStack)-1]
            res := 0
            switch value{
            case "+":
                res = apperand1+apperand2
            case "-":
                res = apperand1-apperand2
            case "*":
                res = apperand1*apperand2
            case "/":
                res = apperand1/apperand2
            }
            someStack = append(someStack, res)

        }else{
            val,_ := strconv.Atoi(value)
            someStack = append(someStack, val)
        }
    }
    return someStack[len(someStack)-1]
}
