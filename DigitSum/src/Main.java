public class Main {
    public static void main(String[] args) {
        System.out.println("The sum of the digits is " + sumDigits(225));
    }

    public static int sumDigits(int number) {
        int outPut = 0;
        if (number <= 0){
            return -1;
        }
        while (number > 0) {
            outPut = outPut + (number % 10);
            number = number / 10;
        }
        return outPut;
    }
}
