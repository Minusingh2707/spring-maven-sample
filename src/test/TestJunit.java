import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
private String mycar = "Maruti";
    Car car1 = new Car();

   @Test
   public void testPrintMessage() {
      car1.setName(mycar);
      assertEquals(mycar,car1.getName());
   }
}
