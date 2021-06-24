  public class Bmi{
  
  /**
  Suppose one of the features in your application is to calculate the BMI of an individual 
  and share their fitness status with them. 
  The piece of code given below was written by an inexperienced intern 
  and does not follow good coding etiquettes.
  
  What are the changes you refactor in the code?

(Note: The code functionality should not change after refactoring is done. 
And, more than one option may be correct.)
  **/
  
 
   //height in feet and weight in pounds
   public static String BMICalculator(double height, int weight) {
    double BMI;  
    double poundsToKg = weight * 0.453592;
    double inchToMetres = (height * height) * 0.0064516;
    
       BMI = poundsToKg/inchToMetres; //1 sq.in = .0064516 m^2
         System.out.print(BMI);
       
  public static void dlass(){
            double x = BMI; 
       if (x < 18.5) {
           return ("Underweight");
       } else if (x < 25) {
           return ("Normal");
       } else if (x < 30) {
           return ("Overweight");
       } else {
           return ("Obese");
       }
   }
  public static void main (String[] args) {
  Bmi bmi =new Bmi();
  System.out.print('\n' +bmi.BMICalculator(2.1, 60));
  }
}  