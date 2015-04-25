/**
  * Sebastiano Valle - 25/04/2015
  * This is the class which represents a ``Client" that uses Blog's
  * functionalities.
  *
  * The Client is asked only to perform some simple operations which are a
  * standard in Java for crossing an aggregate.
*/
package client;
import blog.*;

public class Client {

  public static void main(String[] args) {
    Aggregate aggr = new Blog();
    ( (Blog) aggr).putDummyContent();
    Iterator it = aggr.iterator();
    while(it.hasNext())
      ( (Post) it.next() ).print();
  }
}
