import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class UpgradTest {

   @Test public void defaultTest() {
      Upgrad test = new Upgrad();
      Assert.assertTrue(test.prime(11));
   }
}
