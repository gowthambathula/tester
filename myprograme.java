import java.io.*;
import java.util.*;

public class myprograme {

 
 public static void main(String args[]) throws IOException
 {
 List<Integer> resultList = new ArrayList<Integer>();
 Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
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
      resultList.add(i);
      n=n/i;
      }
   else
       i++;
   }  
   for(int index = 0; index < resultList.size(); index++)
   {
    if(index != resultList.size()-1)
     System.out.print(resultList.get(index)+"*");
    else 
     System.out.print(resultList.get(index));
    if(resultMap.containsKey(resultList.get(index)))
    {
     Integer value = resultMap.get(resultList.get(index));
     resultMap.put(resultList.get(index), value+1);
    }else
    {
    int initialize = 1;
    resultMap.put(resultList.get(index), initialize);
    }
   }
  System.out.println();
  Set<Integer> resultSet = resultMap.keySet();
  
  for(Integer key: resultSet)
  {
   result.append(key+"^"+resultMap.get(key)+"*");
  }
  
  result.replace(result.length()-1, result.length(), "");
  System.out.println(result);
   }
  }
}