/**
  * Sebastiano Valle - 26/04/2015
*/
package test;
import java.util.*;

public class SequentialTest implements Test {
  public boolean checkOrder(ArrayList<Integer> list) {
    for(int i = 0; i < list.size() - 1; i++) {
      int a = list.get(i);
      int b = list.get(i+1);
      if(a > b)
        return false;
    }
    return true;
  }
}
