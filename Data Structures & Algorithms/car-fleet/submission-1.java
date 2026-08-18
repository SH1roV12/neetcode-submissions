class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        class Car implements Comparable<Car>{
            int speed;
            int pos;
            Car(int speed, int pos){
                this.speed = speed;
                this.pos = pos;
            }

            @Override
            public int compareTo( Car o) {
                return Integer.compare(o.pos, this.pos);
            }
        }
        List<Car> someCars = new ArrayList<>();
        for (int i = 0; i < position.length; i++){
            Car car = new Car(speed[i], position[i]);
            someCars.add(car);
        }
        someCars.sort(null);
        Deque<Integer> someStack = new ArrayDeque<>();
        for (int i = 0; i < someCars.size(); i++){

            if (someStack.isEmpty()){
                someStack.push(i);
                continue;
            }
            double carTime = (target - someCars.get(i).pos) /  (double)someCars.get(i).speed;
            double lastCarTime = (target - someCars.get(someStack.peek()).pos) /  (double)someCars.get(someStack.peek()).speed;
            if (carTime > lastCarTime){
                someStack.push(i);
            }else{
                continue;
            }
        }
        return someStack.size();
    }
}
