public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println(reverse(1212));
        System.out.println(reverse(4321));
        System.out.println(reverse(100));
        System.out.println(reverse(-121));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
    public static void numberToWords(int num) {
        int reverseNumber=reverse(num);
        while (reverseNumber!=0){
            int finalNumber=reverseNumber%10;
            switch (finalNumber){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;
            }
            reverseNumber=reverseNumber/10;
        }
    }
    public static int reverse (int originalNumber){
        int newNumber = 0;
        while (originalNumber!=0){
            newNumber=newNumber+originalNumber%10;
            originalNumber=originalNumber/10;
            newNumber=newNumber*10;
        }
        return newNumber;
    }
    public static int getDigitCount(int originalNumber){
        int digitCount = 0;
        if (originalNumber==0){
            return 1;
        }
        else if(originalNumber<0){
            return -1;
        }
        else{
        while (originalNumber>0){
            digitCount++;
            originalNumber=originalNumber/10;
        }
        return digitCount;
    }}
}
