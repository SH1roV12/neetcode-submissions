class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> someDeque = new ArrayDeque<>();
        for (int i = 0; i < asteroids.length; i++){

            if (someDeque.isEmpty() || someDeque.getLast() <= asteroids[i]){
                someDeque.add(asteroids[i]);

            }else{
                if (asteroids[i] > 0){
                    someDeque.add(asteroids[i]);
                    continue;
                }
                int posNumber = asteroids[i] * -1;
                while(!someDeque.isEmpty() && posNumber > someDeque.getLast() && someDeque.getLast() > 0){
                    
                    someDeque.removeLast();
                }
                if (someDeque.isEmpty() || someDeque.getLast() == asteroids[i]|| someDeque.getLast() < 0){
                    someDeque.add(asteroids[i]);
                    continue;
                }   

                if (posNumber == someDeque.getLast()){
                        someDeque.removeLast();
                        continue;
                    }
               
            }
        }
        return someDeque.stream().mapToInt(Integer::intValue).toArray();
    }
}