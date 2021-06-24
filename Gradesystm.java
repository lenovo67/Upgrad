import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
//You are asked to write a code that calculates the student grades given their marks. 
//You are not given any information about the grading scheme, but your colleague, who is a tester tells you that there are 4 grades. \
//Your colleague also tells you that the following assertion statements must hold true:

public class Gradesystm {

  public char getGrades(int marks){
      
  if(marks >=101)
   return 'X';
   if(marks >= 80)
   return 'A';
   if(marks >=60)
   return 'B';
   if(marks >=40)
   return 'C';
   if (marks >=0 && marks <= 39)
   return 'F';
   else 
   return 'X';

  }		

  public static void main (String[] args) {
            Gradesystm g =new Gradesystm();
            System.out.print(g.getGrades(-1));
  }
}