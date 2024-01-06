package IntellijStarting.test;

public class NumberToWordsQuiz {
    public static void main(String[] args) {
        numberToWords(0);
    }

    public static void numberToWords(int number) {
        String zero = "Zero ";
        String one = "One ";
        String two = "Two ";
        String three = "Three ";
        String four = "Four ";
        String five = "Five ";
        String six = "Six ";
        String seven = "Seven ";
        String eight = "Eight ";
        String nine = "Nine ";
        boolean negative = number<0;
        if(negative) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println(zero);
        }
        int reverseNumber = reverse(number);
        int digitCount = getDigitCount(number);
        int digitCountRev= getDigitCount(reverseNumber);
        while (reverseNumber >= 1 ) {
            switch (reverseNumber % 10){
                case 1:System.out.print(one);
                    break;
                case 2:System.out.print(two);
                    break;
                case 3:System.out.print(three);
                    break;
                case 4:System.out.print(four);
                    break;
                case 5:System.out.print(five);
                    break;
                case 6:System.out.print(six);
                    break;
                case 7:System.out.print(seven);
                    break;
                case 8:System.out.print(eight);
                    break;
                case 9:System.out.print(nine);
                    break;
                case 0:System.out.print(zero);
                    break;
            }
            reverseNumber /= 10;
        }
        for (int i=0;i<digitCount-digitCountRev;i++){
            System.out.print(zero);
        }
    }
    public static int reverse(int number){
        int reverseNumber = 0;
        boolean negative = number<0;
        if(negative) {
            number *=-1;
        }
        while (number >= 1) {
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
        }
        if(negative) {
            reverseNumber *=-1;
        }
        getDigitCount(number);
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        int digitCount = 0;
        if(number<0) return -1;
        if (number==0) return 1;
        while (number>0){
            digitCount ++;
            number/=10;
        }
        return digitCount;
    }
}