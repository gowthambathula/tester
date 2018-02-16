public class Positive_Integers
{
	public static void main(String[] args) 
	{
		int p, q, r, t;
		System.out.println(" Prints the 4 digit numbers such that A+B+C+D =45 and A+2 = B-2 =C *2 =D/2\n");
		for ( p = 1; p < 45; p++ )
		{
			for ( q = 1; q < 45; q++ )
			{
				for ( r = 1; r < 45; r++ )
				{
					for ( t = 1; t < 45; t++ )
					{
						if ( (p + q + r + t) == 45 && (p + 2) == (q - 2) && (q - 2) == (r * 2) && (r *2) == (t / 2) )	
						System.out.println( p + ", " + q + ", " + r + ", " + t );
						
					}
				}
			}
		}
	}
}