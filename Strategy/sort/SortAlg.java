/**
  * Sebastiano Valle - 26/04/2015
  * This is the interface which represents the GoF's ``Strategy" interface.
  *
  * Sort interface represents an algorithm which receives a set of elements
  * and modifies it ordering its elements.
*/
package sort;
import java.util.*;

public interface SortAlg {
  public void sort(ArrayList<Integer> list);
}
