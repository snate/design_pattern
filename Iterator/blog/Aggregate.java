/**
  * Sebastiano Valle - 25/04/2015
  * This is the interface which represents GoF's ``Aggregate" interface.
  *
  * An Aggregate is a type of object that equals to a set of objects of the
  * same type. It provides another type of object, called Iterator, to
  * navigate between its elements.
*/
package blog;

public interface Aggregate {

  public Iterator iterator();
}
