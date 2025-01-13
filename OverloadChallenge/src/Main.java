public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(12) + "cm");
        System.out.println(convertToCentimeters(5, 8) + "cm");

    }

    public static double convertToCentimeters(int inches) {
        return (inches * 2.54);
    }

    public static double convertToCentimeters(int feet, int inches) {
        return (convertToCentimeters((feet * 12) + inches)) ;
    }
}
