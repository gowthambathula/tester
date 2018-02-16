//Name : Gowtham reddy Bathula
//ID   : 999992867
//Section : 29


import java.util.Scanner;



 class  RomanNumeral {

private final int num;   

private static int[]    nums = { 1000,  900,  500,  400,  100,   90,  
                                      50,   40,   10,    9,    5,    4,    1 };
                                   
private static String[] letters = { "M",  "CM",  "D",  "CD", "C",  "XC",
                                    "L",  "XL",  "X",  "IX", "V",  "IV", "I" };
   	


public  RomanNumeral(String roman) {
     
      
   if (roman.length() == 0)
      throw new NumberFormatException("An empty string does not define a Roman numeral.");
      
   roman = roman.toUpperCase(); 
   
   int i = 0;       
   int arabic = 0;  
   
   while (i < roman.length()) {
   
      char letter = roman.charAt(i);        
      int number = letterToNumber(letter); 
      
      if (number < 0)
         throw new NumberFormatException("Illegal character \"" + letter + "\" in roman numeral.");
         
      i++; 
      
      if (i == roman.length()) {
            
         arabic += number;
      }
      else {

         int nextNumber = letterToNumber(roman.charAt(i));
         if (nextNumber > number) {
              
            arabic += (nextNumber - number);
            i++;
         }
         else {
              
            arabic += number;
         }
      }
      
   } 
   
   if (arabic > 3999)
      throw new NumberFormatException("Roman numeral must have value 3999 or less.");
      
   num = arabic;
   
} // end constructor


private int letterToNumber(char letter) {
      // Find the integer value of letter considered as a Roman numeral.  Return
      // -1 if letter is not a legal Roman numeral.  The letter must be upper case.
   switch (letter) {
      case 'I':  return 1;
      case 'V':  return 5;
      case 'X':  return 10;
      case 'L':  return 50;
      case 'C':  return 100;
      case 'D':  return 500;
      case 'M':  return 1000;
      default:   return -1;
   }
}


public String toString() {
     
   String roman = "";  
   int N = num;
   for (int i = 0; i < nums.length; i++) {
      while (N >= nums[i]) {
         roman += letters[i];
         N -= nums[i];
      }
   }
   return roman;
}


public int toInt() {
    
   return num;
}


} 

public class RomanToArabicConverter {
    
    public static void main(String[] args) {
       
       System.out.print("Enter a Roman numeral and I will convert it to an ordinary");
       System.out.print("arabic integer.  Enter an integer in the range 1 to 3999");
       System.out.println("and I will convert it to a Roman numeral.  Press return when");
       System.out.println("you want to quit.");
       Scanner sc = new Scanner(System.in);
       while (true) {
 
    	   System.out.println();
    	   System.out.println("? ");
          
         
             
          
             String roman = sc.nextLine();
             try {
            	  RomanNumeral N = new  RomanNumeral(roman);
                 System.out.println(N.toString() + " = " + N.toInt());
             }
             catch (NumberFormatException e) {
                 System.out.println("Invalid input.");
                 System.out.println(e.getMessage());
             }
          
 
       }  
 
    } 
    
 } 