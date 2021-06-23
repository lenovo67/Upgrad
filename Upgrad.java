import java.lang.Math;


public class Upgrad {
   public static boolean prime(int n) {
       for (int i = 2; i <= Math.sqrt(n); i++) {
           if (n % i == 0)
               return false;
       }
       return true;

}
public static void main(String args[])
{
      Upgrad test = new Upgrad();
      test.prime(1);

}  

}
