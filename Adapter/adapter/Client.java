/**
  * Sebastiano Valle - 04/04/2015
  * This is the class which represents GoF's ``Client" class.
  *
  * The client has a very simple role in the Adapter pattern (and in most of
  * patterns), since he only instantiates a GreeterAdapter (through IGreeter
  * interface) and then it calls "greet()" method on it.
*/
package adapter;
import adaptee.Adaptee;

public class Client {
  private String name;

  public static void main(String[] args) {
    Adaptee extComponent = new Adaptee();
    IGreeter a = new GreeterAdapter(extComponent); // Object Adapter
    // IGreeter a = new GreeterAdapter2();  // Class Adapter
    a.greet(args[0]);
  }
}
