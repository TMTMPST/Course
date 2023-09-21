public class Challenge1 {
    public static void main(String[] args) {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("My Value Total is " + myValuesTotal);
        double myRemainder = myValuesTotal % 40.00d;
        System.out.println("The Remainder is " + myRemainder);
        boolean remainder = (myRemainder == 0) ? true : false;
        System.out.println(remainder);
        if (!remainder) {
            System.out.println("got some remainder");
        }
    }
}
