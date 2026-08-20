class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         Deque<Integer> someStack = new ArrayDeque<>();
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++){
            res[i] = 0;
            if (someStack.isEmpty()){
                someStack.push(i);
                continue;
            }



            while (!someStack.isEmpty() && temperatures[i] > temperatures[someStack.peek()]){

                res[someStack.peek()] = i-someStack.peek();
                someStack.pop();
            }
            someStack.push(i);
        }
        return res;
    }
    }
