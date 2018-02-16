import java.util.Scanner;

/**
 *
 * @author Y.ACHCHUTHAN
 * @version 1.0.0.0
 */
public class RomanToDecimal {

    public int CheckRoman(int TotalDecimal, int LastRomanLetter, int LastDecimal) {
        if (LastRomanLetter > TotalDecimal) {
            return LastDecimal - TotalDecimal;
        } else {
            return LastDecimal + TotalDecimal;
        }
    }

    public void romanToDecimal(String romanNumber) {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();
        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal = CheckRoman(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = CheckRoman(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = CheckRoman(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = CheckRoman(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = CheckRoman(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = CheckRoman(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = CheckRoman(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
        System.out.println(romanNumeral + " is equal to " + decimal);
    }

    public void CallRoman() {
        Scanner getRoman = new Scanner(System.in);
        String Roman = getRoman.next();
        switch (Roman) {
            default:
                romanToDecimal(Roman);
                CallRoman();
            case "End":
                break;

        }
    }

    public static void main(String[] args) {
        RomanToDecimal r2d = new RomanToDecimal();
        System.out.println("Enter roman number you want to convert \nCommand End to stop entering ");
        r2d.CallRoman();

    }
}