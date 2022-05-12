public class Counter {
    private int counter;

    //constructor
    public Counter(){
        this.counter = 0;
    }
    //constructor 2
    public Counter(int startValue){
        this.counter = startValue;
    }

    public int value(){
        return counter;
    }

    public void increase(){
        counter++;
    }
    public void increase(int increaseBy){
        if (increaseBy < 0){
            return;
        } else {
            counter = counter + increaseBy;
        }
    }
    public void decrease(){
        counter--;
    }
    
    public void decrease(int decreaseBy){
        if (decreaseBy < 0){
            return;
        } else {
            counter = counter - decreaseBy;
        }
    }
    public String toString(){
        return "Currently the counter is set to " + value();
    }
}
