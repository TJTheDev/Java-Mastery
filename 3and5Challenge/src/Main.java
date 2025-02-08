public class Main {
    public static void main(String[] args) {
        int exitCounter = 0;
        int sumOfNumbers = 0;
        for (int x = 1; x <= 1_000; ++x) {
            if (exitCounter >= 5)
            {
                System.out.println("The Sum of the numbers is " + sumOfNumbers);
                break;
            } if (x % 5 == 0 && x % 3 == 0)
            {
                ++exitCounter;
                sumOfNumbers = sumOfNumbers + x;
                System.out.println("Number " + exitCounter + " is " + x);
            }
        }
    }
}
