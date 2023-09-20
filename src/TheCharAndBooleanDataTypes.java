public class TheCharAndBooleanDataTypes {
    public static void main(String[] args) {
        char myUnicode = '\u0044';
        System.out.println(myUnicode);

        char myDecimalcode = 68;
        System.out.println(myDecimalcode);

        // challenge

        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDecimalChar = 63;
        System.out.println("My values are " + mySimpleChar + myUnicodeChar + myDecimalChar);

        // Boolean

        boolean myTrueBooleanValue = true;
        System.out.println(myTrueBooleanValue);

        boolean myFalseBooleanValue = false;
        System.out.println(myFalseBooleanValue);

        boolean isCustomerOverTwentyOne = true;
        System.out.println(isCustomerOverTwentyOne);

    }
}