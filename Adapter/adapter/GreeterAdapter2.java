/**
  * Sebastiano Valle - 04/04/2015
  * CAUTION - It is enough to use either one of Class and Object Adapter.
  *
  * This is the class which represents GoF's ``Adapter" class, in the Class
  * Adapter case.
  *
  * This class carries out all the goals of the other pattern version (i.e.
  * Object Adapter, which can be found in GreeterAdapter.java).
  *
  * The main difference between these two classes is that:
  * <ul>
  * <li>
  * Object Adapter can communicate with a polymorphic reference of the Adaptee
  * </li>
  * <li>
  * Class Adapter can override more easily some Adaptee's methods we want to
  *   refine
  * </li>
  * </ul>
*/
package adapter;
import adaptee.Adaptee;

class GreeterAdapter2 extends Adaptee implements IGreeter {

  public GreeterAdapter2() { }

  public void greet(String name) {
    String myGreet = this.sayHello(name);  //uses Adaptee's inherited method
    System.out.println(myGreet);
  }
}
