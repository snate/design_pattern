/**
  * Sebastiano Valle - 25/04/2015
  * This is the interface which represents GoF's ``Iterator" interface.
  *
  * An Iterator is used to navigate an Aggregate. In this basic implementation
  * of the Iterator pattern, we'll see only the operations to get the next
  * element and to know if we reached the end of the list.
  *
  * The same operations are available for backward direction.
*/
package blog;

public interface Iterator {

  public Object next();
  public boolean hasNext();
  public Object prev();
  public boolean hasPrev();
}
