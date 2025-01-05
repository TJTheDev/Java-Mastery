public class OperatorChallenge {
    public static void main(String[] args) {
        double myDouble = 20;
        double myDouble2 = 80;
        double myTotal = (myDouble + myDouble2) * 100;
        System.out.println("My Total = " + myTotal);
        boolean isNoRemainder = myTotal % 40 == 0 ? true : false;
        System.out.println("My boolean is " + isNoRemainder);
        if (isNoRemainder == false) {
            System.out.println("My Total % 40 has a remainder of " + myTotal % 40);
        }
    }
}
