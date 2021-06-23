public class TddGraded{

/***
Consider the program given below,
 which has three functions, 
 namely prime, composite, and range, 
 It tells us whether a given number is prime or composite and whether the number falls in the range 1-100. 
 Using these functions, we need to generate all the prime numbers between 1-100.  
 (Note: Composite Numbers : A whole number that can be divided exactly by numbers other than 1 or itself)

What could be the best possible way to create test cases so as to ensure maximum correctness during 
test-driven development?
**/

   static boolean prime(int n) {
   
      for (int i = 2; i < n; i++) {
         if (n % i == 0)
            return false;
      }
      return true;
   }
   static boolean composite(int n) {
      if (n <= 1) {
         return false;
      }
      for (int i = 2; i < n; i++) {
         if (n % i == 0) {
            return true;
         }
      }
      return false;
   }
   static boolean range(int n) {
      if (n < 1 || n > 100) {
         return false;
      }
      return true;
   }

   public static void main(String args[]){
   TddGraded tdd=new TddGraded();
   System.out.print("prime" +' ' +tdd.prime(2)+ ' ' +'\n');
      System.out.print("composite"+ ' ' +tdd.composite(4)+ ' ' +'\n');
      System.out.print("range"+ ' ' +tdd.range(4));
   
   
   }
   
   }