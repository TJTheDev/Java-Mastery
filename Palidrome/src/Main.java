public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-115411));

    }

//        public static boolean isPalindrome(int number) {
//            double numberRev = 0;
//            double placeCount = 1;
//            int multiplier = 1;
//            int loopCount = 0;
//            int numberRemainding = number;
//            while (numberRemainding != 0) {
//                loopCount++;
//                numberRev = (numberRev + (placeCount * (numberRemainding % 10)));
//                placeCount = placeCount * .10;
//                multiplier = multiplier * 10;
//                numberRemainding = numberRemainding / 10;
//            }
//            numberRev = (numberRev * ((double) multiplier / 10));
//            int outPut = (int) numberRev;
//            return outPut == number;
//        }


        public static boolean isPalindrome(int number) {

            int reverse = 0;
            int original = number;
            while (original != 0) {
                reverse = reverse * 10 + original % 10;
                System.out.println(reverse);
                original /= 10;
            }
            return reverse == number;
        }
}
