//Prime number checker
import java.util.Scanner;

public class PrmeNumChck
{
  public static void main (String[]args)
  {
    Scanner reader = new Scanner (System.in);
      System.out.println ("Enter a number to check prime or not: ");
    int num = reader.nextInt ();
    boolean stat = true;
    for (int i = 2; i < num / 2; i++)
      {
	if (num % i == 0)
	  {
	    stat = false;
	    break;
	  }
      }
    if (stat == true)
      {
	System.out.println ("Entered " + num + " number is a prime number.");
      }
    else
      {
	System.out.println ("Entered " + num +
			    " number is not a prime number.");
      }
  }
}