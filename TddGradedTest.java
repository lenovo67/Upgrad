import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TddGradedTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
    
   }


   /** A test that always fails. **/
   @Test public void defaultTest() {
   TddGraded tdd= new TddGraded();
         Assert.assertTrue(tdd.prime(2));
         Assert.assertTrue(tdd.composite(4));
         Assert.assertTrue(tdd.range(3));
         
   }
}
