public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello, Human.");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100!");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("The newValue int " + newValue + " matches");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic == true) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic == true) ? ("The " + makeOfCar + " is domestic") : ("The " + makeOfCar + " is not domestic");
        System.out.println(s);
    }
}
