class Solution:
    def calPoints(self, operations: List[str]) -> int:
        someDeq = collections.deque()
        for i in range(len(operations)):
            if operations[i] == "+":
                num1 = someDeq.pop()
                num2 = someDeq.pop()
                someDeq.append(num2)
                someDeq.append(num1)
                someDeq.append(num1+num2)
            elif operations[i] == "C":
                someDeq.pop()
            elif operations[i] == "D":
                num = someDeq.pop()
                someDeq.append(num)
                someDeq.append(num*2)
            else:
                someDeq.append(int(operations[i]))
        total = 0
        while len(someDeq) != 0:
            total += someDeq.pop()
        return total