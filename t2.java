//Gowtham Reddy Bathula	
//999992867
import java.util.*;
import java.io.*;
import java.lang.*;

public class t2{
	
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter roman number");
		String g=s.nextLine();
		roman(g);
	}
	
	public static int roman(String m){
		char n;
		int number ;
		int r ;
		for (int i=0;i<m.length();i++)
		{
				 n = m.charAt(i);               

                if (n == 'I'){
                    number = 1;
                } else if (n == 'V'){
                    number = 5;
                } else if (n == 'X'){
                    number = 10;
                }else if (n == 'L'){
                    number = 50;
                } else if (n == 'C'){
                    number = 100;
                } else if (n == 'D'){
                    number = 500;
                } else if (n == 'M'){
                    number = 1000;
                } else {
                    number = -1;
					}
				 if (i==m.length()){
                    r+= number;
                } else {
                    number = m.charAt(i);
                    int nextnumber = number;
                    if(nextnumber > number){
                        r += (nextnumber - number);
                        i++;
                    } else {
                        r += number;
                    }
                }
            }
		return(number);}
	}
