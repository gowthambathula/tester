public class MonthName
{
 public static void main(String args[])
 {
  System.out.println("Month 1: " + month_name(1));

  System.out.println("Month 2: " + month_name(2));

  System.out.println("Month 3: " + month_name(3));

  System.out.println("Month 4: " + month_name(4));

  System.out.println("Month 5: " + month_name(5));

  System.out.println("Month 6: " + month_name(6));

  System.out.println("Month 7: " + month_name(7));

  System.out.println("Month 8: " + month_name(8));

  System.out.println("Month 9: " + month_name(9));

  System.out.println("Month 10: " + month_name(10));

  System.out.println("Month 11: " + month_name(11));

  System.out.println("Month 12: " + month_name(12));

  System.out.println("Month 43: " + month_name(43));
 }

 public static String month_name(int a)
 {
  String value = "Pass a value";

  if(a>0 && a<13)
  {
    if(a==1)
    {
     value = "january";
     return value;
    }

    else if(a==2)
    {
     value = "february";
     return value;
    }

    else if(a==3)
    {
     value = "march";
     return value;
    }

    else if(a==4)
    {
     value = "april";
     return value;
    }

    else if(a==5)
    {
     value = "may";
     return value;
    }

    else if(a==6)
    {
     value = "june";
     return value;
    }

    else if(a==7)
    {
     value = "july";
     return value;
    }

    else if(a==8)
    {
     value = "august";
     return value;
    }

    else if(a==9)
    {
     value = "september";
     return value;
    }

    else if(a==10)
    {
     value = "october";
     return value;
    }

    else if(a==11)
    {
     value = "november";
     return value;
    }

    else if(a==12)
    {
     value = "december";
     return value;
    }
  }

  else
  {
    value = "Error";
    return value;
  }
  
  return value;
 }


}