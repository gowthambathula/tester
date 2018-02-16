
//gowtham reddy bathula
//999992867

import java.util.*;

import java.lang.*;

public class RandomGame{

public static void main(String[] args) {

int guess;   

long maximum = 1000000;
int minimum = 1;
Random r=new Random();
long x =r.nextInt(1000000);


int count = 0;

HashSet<Integer> hset=new HashSet<Integer>();

System.out.println("Guess a number from 1 to 1000000");

Scanner input = new Scanner(System.in);
try {
	

do{

guess = input.nextInt();

hset.add(guess);

 if (guess > x){

System.out.println("Too large");

}else if (guess < x){

System.out.println("Too small");

}

} while (guess != x);

for(Integer b:hset){

count++;

}

System.out.println("YOU GUESSED IT IN " + count + " STEPS!");


}
catch(Exception e)
{
System.out.println("Enter valid number");
}

}
}

