import java.util.*;
import java.io.*;
import java.lang.*;
  
public class as6partB
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Scanner s = new Scanner( System.in );
	Scanner m = new Scanner( System.in );
	System.out.println("english to latin ");
	
		System.out.println("enter the text");
	String i = m.nextLine();
	System.out.println("you entered "+i);
	System.out.println("Its translation is");
    latin(i);
  
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
	  System.out.println(g+"ay");}
	  else{
		  
				n=e.charAt(0);
	  for( i=1;i<e.length();i++)
        {
            g = e.charAt(i);
            
			System.out.print(g);
            
		}
		System.out.print(n+"ay ");
		}
  
	  return "";
  }
  }