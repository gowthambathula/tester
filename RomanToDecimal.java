import java.util.Scanner;


public class RomanToDecimal {

    public int CheckRoman(int TotalDecimal, int LastRomanLetter, int LastDecimal) {
		int n=0;
		/*if(n>TotalDecimal){
			System.out.println("Invalid numeral: two consecutive subtractions.");
		return 0;}
		else{*/
        if (LastRomanLetter > TotalDecimal ){
			if(TotalDecimal==5||TotalDecimal==50||TotalDecimal==500){
				System.out.println("Invalid numeral: can't subtract auxiliary symbol");
				return 0;
			
	
}
		else
		{
            n= LastDecimal - TotalDecimal;
			return n;
        } 
		}
		else 
		{
            return LastDecimal + TotalDecimal;
	}
	//}
	}
    

    public void romanToDecimal(String romanNumber) {
        int decimal = 0,n=0, x=0;
        int lastNumber = 0;
		char y,z;
        String romanNumeral = romanNumber.toUpperCase();
		 for ( x = romanNumeral.length()-1; x > 0; x--){
			  y =romanNumeral.charAt(x);
			  z =romanNumeral.charAt(x-1);
			 if(z=='M'&& y=='D'||y=='C'||y=='L'||y=='X'||y=='V'||y=='I')
			 n++;
			 if(z=='D'&& y=='C'||y=='L'||y=='X'||y=='V'||y=='I')
			 n++;
			 if(z=='C'&& y=='L'||y=='X'||y=='V'||y=='I')
			 n++;
			 if(z=='L'&& y=='X'||y=='V'||y=='I')
			 n++;
			 if(z=='X'&&y=='V'||y=='I')
			  n++;
			 if(z=='V'&&y=='I')
				 n++;
			 if (n>3)
			 {System.out.println("Invalid numeral: two consecutive subtractions.");
		 	 break;
			 }
			 n=0;
		 }
		 for ( x =0; x > romanNumeral.length(); x++){
			  z =romanNumeral.charAt(x);
			  y =romanNumeral.charAt(x+1);
			 if(z=='M'&& y=='D'||y=='C'||y=='L'||y=='X'||y=='V'||y=='I')
			 {n++;
			 if(z=='D'&& y=='C'||y=='L'||y=='X'||y=='V'||y=='I')
			 n++;
			 if(z=='C'&& y=='L'||y=='X'||y=='V'||y=='I')
			 n++;
			 if(z=='L'&& y=='X'||y=='V'||y=='I')
			 n++;
			 if(z=='X'&&y=='V'||y=='I')
			  n++;
			 if(z=='V'&&y=='I')
			 n++;}
		 if(z=='D'&& y=='C'||y=='L'||y=='X'||y=='V'||y=='I')
		 {n++;
			 if(z=='C'&& y=='L'||y=='X'||y=='V'||y=='I')
			 n++;
			 if(z=='L'&& y=='X'||y=='V'||y=='I')
			 n++;
			 if(z=='X'&&y=='V'||y=='I')
			  n++;
			 if(z=='V'&&y=='I')
		 n++;}
	  if(z=='C'&& y=='L'||y=='X'||y=='V'||y=='I')
	  { n++;
			 if(z=='L'&& y=='X'||y=='V'||y=='I')
			 n++;
			 if(z=='X'&&y=='V'||y=='I')
			  n++;
			 if(z=='V'&&y=='I')
	  n++;}	
			 if(z=='X'&&y=='V'||y=='I')
			 {  n++;
			 if(z=='V'&&y=='I')
		 n++;}
			 if (n>=1)
			 {System.out.println("Invalid numeral: additions don't decrease.");
		 	 break;
			 }
			 n=0;
		 }
		
        for ( x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            if(convertToDecimal=='M'){
                    decimal = CheckRoman(1000, lastNumber, decimal);
                    lastNumber = 1000;
			}
            else if(convertToDecimal=='D'){
                    decimal = CheckRoman(500, lastNumber, decimal);
                    lastNumber = 500;
                   }
            else if(convertToDecimal=='C'){
                    decimal = CheckRoman(100, lastNumber, decimal);
                    lastNumber = 100;
                   }
            else if(convertToDecimal=='L'){
                    decimal = CheckRoman(50, lastNumber, decimal);
                    lastNumber = 50;
                   }
            else if(convertToDecimal== 'X'){
                    decimal = CheckRoman(10, lastNumber, decimal);
                    lastNumber = 10;
              }
            else if(convertToDecimal== 'V'){
                    decimal = CheckRoman(5, lastNumber, decimal);
                    lastNumber = 5;
                   }
            else if(convertToDecimal== 'I'){
                    decimal = CheckRoman(1, lastNumber, decimal);
                    lastNumber = 1;
                    }
            else {System.out.println("Invalid character in input. Valid characters are I,V,X,L,C,D,M.");
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