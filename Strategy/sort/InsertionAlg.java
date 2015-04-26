/**
  * Sebastiano Valle - 26/04/2015
  * This is the class which represents the GoF's ``StrategyA" class.
  *
  * InsertionAlg uses InsertionSort to sort the given set.
*/
package sort;
import java.util.*;

public class InsertionAlg implements SortAlg {
  public void sort(ArrayList<Integer> list) {
    Integer key;
    for(int j = 1; j < list.size(); j++) {
      Integer temp = list.get(j);
      //key = new Integer(temp.intValue());
      key = temp.intValue();
      int i = j -1;
      while(i >= 0 && list.get(i) > key) {
        list.set(i+1,list.get(i));
        i--;
      }
      list.set(i+1,key);
    }
  }
}
