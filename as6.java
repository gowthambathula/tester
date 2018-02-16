//Gowtham Reddy Bathula	
//999992867
import java.util.*;
import java.io.*;
import java.lang.*;
  
public class as6
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Scanner s = new Scanner( System.in );
	Scanner m = new Scanner( System.in );
	System.out.println("1 for english to latin \n2 for latin to english");
	int g=s.nextInt();
	if(g==1)
	{	System.out.println("enter the text");
	String i = m.nextLine();
	System.out.println("you entered "+i);
	System.out.println("Its translation is");
    latin(i);
  }
  else if(g==2)
  {		System.out.println("enter the text");
	String i = m.nextLine();
	System.out.println("you entered "+i);
	System.out.println("Its translation is");  
	
	eng(i);
  }
  }
  
  public static String[] latin(String m)
  {
	  int l;
	  String[] splitStr = m.split("\\s+");
	  l=splitStr.length;
	  for(int i=0;i<l;i++)
	  {
	  caps(splitStr[i]);}
	  return splitStr;  
	  
		  
  }
  public static String caps(String e)
  {
	  char g,n,z;
	  int h,a,s,i,j;
	  int cap=0;
	  if (e.length()==1)
	  { g=e.charAt(0);
	  System.out.print(g+"ay ");}
	  else{  n=e.charAt(0);
		  z=e.charAt(1);
		  int asc = (int)n;
		  if(asc >=65 && asc <=90){
				h=(int)n+32;
				j=(int)z-32;
				System.out.print((char)j);
				for( i=2;i<e.length();i++)
        {
            g = e.charAt(i);
            
			System.out.print(g);
            
		}
		System.out.print((char)h+"ay ");
		}
	  
	  else{n=e.charAt(0);
				
	  for( i=1;i<e.length();i++)
        {
            g = e.charAt(i);
            
			System.out.print(g);
            
		}
		System.out.print(n+"ay ");
		}
  }
	  return "";
  }
  public static String[] eng(String m)
    {
	  int l;
	  String[] splitStr = m.split("\\s+");
	  l=splitStr.length;
	  for(int i=0;i<l;i++)
	  {
	  saps(splitStr[i]);}
	  return splitStr;  
	  
		  
  }
public static String saps(String e)
  {
	  char g,n,z;
	  int h,a,s,i,j;
	  int cap=0;
	  if (e.length()==3)
	  { g=e.charAt(0);
	  System.out.print(g+" ");}
	  else{
		  z=e.charAt(0);
		  n=e.charAt(e.length()-3);
		  int asc = (int)z;
			  if(asc >=65 && asc <=90){
				h=(int)n-32;
				j=(int)z+32;
				System.out.print((char)h);
				System.out.print((char)j);
				for( i=1;i<e.length()-3;i++)
        {
            g = e.charAt(i);
            
			System.out.print(g);
            
		}
		System.out.print(" ");
		}
				
				
		else{
		
			
				
		  n=e.charAt(e.length()-3);
		  System.out.print(n);
		  
	  for( i=0;i<e.length()-3;i++)
        {
            g = e.charAt(i);
            
			System.out.print(g);
            
		}
		System.out.print(" ");
		}
	  }
	  return "";
  
  }
  }