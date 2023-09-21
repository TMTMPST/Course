public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");
        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("is in not an alien ! ");

        }
        int topScore = 90;
        if (topScore < 100) {
            System.out.println("you got the high score");
        }
        int secondTopScore = 78;
        if ((topScore > secondTopScore) && (topScore < 100) ) {
            System.out.println("Greater than second top score and less than 100");

        }
        if ((topScore > 90) || (secondTopScore <=90)) {
            System.out.println("Either or Both of the conditions are true");

        }
        int newValue = 50;
        if (newValue == 50) { // = is not supposed happen, instead using this (==)
            System.out.println("this is error");
        }
        boolean isCar = false; //! is NOT
        if (!isCar ) { // = is not supposed happen, instead using this (==) or can use != (false)
            System.out.println("this is not supposed happen");
        }
        String makeOfCar = "Volkswage";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic " : "This car is not domestic";
        System.out.println(s);
    }
}