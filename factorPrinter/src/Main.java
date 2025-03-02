public class Main {
    public static void main(String[] args) {
        printFactors(100);

    }

    public static void printFactors(int number){
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int numberOut = 1;

        while (numberOut != number) {
            if (number % numberOut == 0){
                System.out.print(numberOut + " ");
            }
            numberOut++;

        }
        System.out.print(numberOut);
    }
}
