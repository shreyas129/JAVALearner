public class FloatingPointPrecisionAndAChallenge {
    public static void main(String[] args) {

        // Floating point

        int myTntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;
        System.out.println(myTntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        myTntValue = 5 / 2;
        System.out.println(myTntValue);

        myFloatValue = 5f / 2f;
        System.out.println(myFloatValue);

        myDoubleValue = 5d / 2d;
        System.out.println(myDoubleValue);

        myTntValue = 5 / 3;
        System.out.println(myTntValue);

        myFloatValue = 5f / 3f;
        System.out.println(myFloatValue);

        myDoubleValue = 5d / 3d;
        System.out.println(myDoubleValue);

        myDoubleValue = 5.00 / 3;
        System.out.println(myDoubleValue);

        myDoubleValue = 5d / 3.00;
        System.out.println(myDoubleValue);

        // myFloatValue = 5.00 / 3f;  ---  Error
        // System.out.println(myFloatValue);  ---  Error

        // Challenge

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("converted Kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        System.out.println(pi);

        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(anotherNumber);
    }
}