public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));

    }

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int evenDigitSum = 0;
        while(number > 0){
            if (((number % 10) % 2) == 0){
                evenDigitSum = evenDigitSum + (number % 10);
            }
            number = number / 10;
        }
        return evenDigitSum;
    }
}
