package mycustompackage;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println(isPrime(1));
    System.out.println(isPrime(17));
    System.out.println(isPrime(23));    
    System.out.println(isPrime(8675309));
    System.out.println("Please enter an integer: ");
    int num1 = sc.nextInt();
    System.out.println(isPrime(num1));
  }

  public static boolean isPrime(int N)
  {
    for (int i = 2; i < N; i++)
    {
      if (N%i == 0)
      {
        return false;
      }
    }
    return true;
  }
}
