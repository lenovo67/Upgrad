import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class GradesystmTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void defaultTest() {
   Gradesystm gradingScheme=new Gradesystm();
assertEquals('X',gradingScheme.getGrades(1200));
assertEquals('A',gradingScheme.getGrades(100));
assertEquals('A',gradingScheme.getGrades(80));
assertEquals('B',gradingScheme.getGrades(79));
assertEquals('B',gradingScheme.getGrades(60));
assertEquals('C',gradingScheme.getGrades(59));
assertEquals('C',gradingScheme.getGrades(40));
assertEquals('F',gradingScheme.getGrades(0));
assertEquals('X',gradingScheme.getGrades(-1));
   }
}
