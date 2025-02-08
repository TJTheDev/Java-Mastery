public class Main {
    public static void main(String[] args) {
        int x = 5;
        int evenOut = 0;
        int oddOut = 0;
        while (x <= 20) {
            if (isEvenNumber(x)) {
                evenOut++;
                System.out.println(x + " is even");
            }
            else {
                oddOut++;
            }
            if (evenOut == 5){
                System.out.println("Found " + evenOut + " even numbers.");
                System.out.println("Found " + oddOut + " odd numbers.");
                break;
            }
            x++;
        }
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
