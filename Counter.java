package ObjectsInListsPractice;
public class Counter {
    
    private int number;

    public Counter () {
        this.number = 0;
    }

    public Counter (int startValue) {
        this.number = startValue;
    }

    public Integer value() {
        return this.number;
    }

    public void increase() {
        this.number = this.number + 1;
    }

    //Overload method to increase by number entered
    public void increase(int increaseBy) {
        if(increaseBy <= 0) {
            System.out.println("A negative number was entered. Counter does not change: ");
        } else {
        this.number = this.number + increaseBy;
    }
}

    public void decrease() {
        this.number = this.number - 1;
    }

    public void decrease(int decreaseBy) {
        if(decreaseBy <= 0) {
            System.out.println("A negative number was entered. Counter does not change: ");
        } else {
        this.number = this.number - decreaseBy;
    }
}

    /**
     * @return int return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Counter = " + number;
    }
    
}


