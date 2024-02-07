import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class CounterTest {
    Boolean[] array1 = {true,  true,  true,  false,
                      true,  true,  true,  true ,
                      true,  false, true,  false,
                      true,  false, false, true ,
                      true,  true,  true,  true ,
                      false, false, true,  true };

    @Test
    public void test() {
      assertEquals("There are 17 sheeps in total", 17, new Counter().countSheeps(array1));
    }
}

public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
      
    int count = 0;
    

    
      for(int i = 0; i < arrayOfSheeps.length; i++){
        if(arrayOfSheeps[i] == null){
          return count;
        }
        if(arrayOfSheeps[i] == true){
          count++;
        }
      }
    
    return count;
  }
}
