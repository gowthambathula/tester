//Gowtham Reddy Bathula
//MCIS
//999992867
import java.io.*;
import java.util.*;

public class as2partB {
	public static void main(String[] args){
	int primes[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691};	
	int a,i=0;
	System.out.println("enter number");
		Scanner inp = new Scanner(System.in);
		a=inp.nextInt();
		if(a<100||a>700)
			System.out.println("enter between 100 and 700");
		else
		{
	System.out.println("factors of"+a+"are");
	System.out.print("1^1");
	for(i=0;i<125;i++)
	{if(a%primes[i]==0)
		{a=a/primes[i];
	
			if(a%primes[i]==0)
			{a=a/primes[i];
			if(a%primes[i]==0)
			{a=a/primes[i];
			if(a%primes[i]==0)
			{a=a/primes[i];
			if(a%primes[i]==0)
			{a=a/primes[i];
			if(a%primes[i]==0)
			{a=a/primes[i];
			if(a%primes[i]==0)
			{a=a/primes[i];
			if(a%primes[i]==0)
			{a=a/primes[i];
			if(a%primes[i]==0)
			{a=a/primes[i];
			if(a%primes[i]==0)
			{a=a/primes[i];}
			else
			System.out.print("*"+primes[i]+"^9");}
			else
			System.out.print("*"+primes[i]+"^8");}
			else
			System.out.print("*"+primes[i]+"^7");}
			else
			System.out.print("*"+primes[i]+"^6");}
			else
			System.out.print("*"+primes[i]+"^5");}
			else
			System.out.print("*"+primes[i]+"^4");}
			else
			System.out.print("*"+primes[i]+"^3");}
			else
			System.out.print("*"+primes[i]+"^2");}
			else
	System.out.print("*"+primes[i]+"^1");}
	}}}
		
	
	}