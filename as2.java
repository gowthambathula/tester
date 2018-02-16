import java.io.*;
import java.util.*;

public class as2 {

  /* Java Program that is reading from the keyboard a value between 100 and 700
 and is printing on the screen the prime divisors of the number.  */
 public static void main(String args[]) throws IOException
 {
 List<Integer> rL = new ArrayList<Integer>();
 Map<Integer, Integer> rH = new HashMap<Integer, Integer>();
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 StringBuffer result = new StringBuffer();
 int n;
 System.out.print("Enter a Number : ");
 n=Integer.parseInt(br.readLine());
  if(n < 100 || n > 700)
  {
   System.out.println("Invalid Number!! Please enter the valid number in between 100 to 700");
  }
  else
  {
   System.out.print("The Prime Divisors of "+n+" are : ");
   int i=2;
   while(n>1)
   {
     if(n%i == 0)
     {
      rL.add(i);
      //System.out.print(i+"*");
        n=n/i;
      }
   else
       i++;
   }  
   for(int index = 0; index < rL.size(); index++)
   {
    if(index != rL.size()-1)
     System.out.print(rL.get(index)+"*");
    else 
     System.out.print(rL.get(index));
    if(rH.containsKey(rL.get(index)))
    {
     Integer value = rH.get(rL.get(index));
     rH.put(rL.get(index), value+1);
    }else
    {
    int initialize = 1;
    rH.put(rL.get(index), initialize);
    }
   }
  System.out.println();
  Set<Integer> resultSet = rH.keySet();
  
  for(Integer key: resultSet)
  {
   result.append(key+"^"+rH.get(key)+"*");
  }
  
  result.replace(result.length()-1, result.length(), "");
  System.out.println(result);
   }
  }
}