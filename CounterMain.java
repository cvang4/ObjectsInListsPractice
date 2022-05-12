package ObjectsInListsPractice;
public class CounterMain {
    public static void main(String[] args) {
        
        //Counter with no parameters is zero by default.
        Counter number = new Counter();
        System.out.println("Method with no parameters: " + number);

        Counter number2 = new Counter(10);
        Counter number3 = new Counter(30);

        //If you try to decrease by a negative number it will only print the original number. Counter's value does not change.
        number2.decrease(-5);
        System.out.println(number2);

        number2.decrease(5);
        System.out.println(number2);

        //If you try to increase by a negative number it will only print the original number. Counter's value does not change.
        number3.increase(-3);
        System.out.println(number3);

        number3.increase(3);
        System.out.println(number3);
    }
}
