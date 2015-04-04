/**
  * Sebastiano Valle - 04/04/2015
  * This is the interface which represents GoF's ``Target" interface.
  *
  * In my example, IGreater offers an operation to greet who uses the program,
  * but the cool great implementation I need is located in a class of
  * <em>another</em> package, i.e. Adaptee.java (sample name).
  *
  * Besides that, IGreater offers an operation "void greet()", while
  * Adaptee.java provide the implementation of the method we need, but it
  * provides the signature "String sayHello()" for it.
  *
  * In the working solution, an <b>Object Adapter</b> will be used to solve the
  * architectural issue we encountered.
*/
package adapter;

public interface IGreeter {
  void greet(String name);
}
