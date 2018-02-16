import java.util.*;
import java.io.*;
import java.lang.*;
  
public class as6partA
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Scanner s = new Scanner( System.in );
	Scanner m = new Scanner( System.in );
	System.out.println(" latin to english");
	
			System.out.println("enter the text");
	String i = m.nextLine();
	System.out.println("you entered "+i);
	System.out.println("Its translation is");  
	
	eng(i);
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
				
		  n=e.charAt(e.length()-3);
		  System.out.print(n);
		  
	  for( i=0;i<e.length()-3;i++)
        {
            g = e.charAt(i);
            
			System.out.print(g);
            
		}
		System.out.print(" ");
		}
	  
	  return "";
  
  }
  }