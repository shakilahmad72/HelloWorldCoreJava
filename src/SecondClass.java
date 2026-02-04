public class SecondClass {

    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am Scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the top score!");
        }

        int secondTopScore = 95;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90)  || (secondTopScore <= 90)) {
            System.out.println("Either or both of the condition are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This ciar is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double myFirstValue = 20.00d;
        double myScondValue = 80.00d;
        double myValueTotal = (myFirstValue + myScondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValueTotal);
        double theRemiander = myValueTotal % 40.00d;
        System.out.println("theRemainder = " + theRemiander);
        boolean isNoRemainder = (theRemiander == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }



    }
}
