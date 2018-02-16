import java.util.*;
import java.io.*;

public class as3{
	public static void main(String[] args){
		int a;
		String  b;
		Scanner sam= new Scanner(System.in);
		System.out.println("whats is your name?");
		b=sam.nextLine();
		System.out.println(b+",How old are you?");
		a=sam.nextInt();
		if(a<=16)
			System.out.println("You are not allowed to drive at the moment,"+b);
		else if(a>16&&a<=18)
			System.out.println("You are not allowed to vote at the moment,"+b);
		else if(a>18&&a<=25)
			System.out.println("You are not allowed to rent a car at the moment,"+b);
		else
			System.out.println("You can do anything that is legal,"+b);
		
		
		
		
	}

	}