/**
  * Sebastiano Valle - 04/04/2015
  * This is the class which represents GoF's ``Adapter" class.
  *
  * Adapter is needed because my client asks for a method that has exactly the
  * signature "void greet()".
  *
  * For example, this could be possible if we designed our package with a
  * Greeter concrete class that provides a greeting method that back in time
  * used to fulfill our needs.
  *
  * But suddenly we found out a new class, Adaptee from the adaptee package,
  * which accomplishes the same goals and we want to use it.
  *
  * We don't wanna throw all of our code in the rubbish, so we have to think a
  * way to include the functionalities given by Adaptee in our product.
  * One of the simplest way to reach this aim is to use the Object Adapter, as
  * suggested by GoF.
*/
package adapter;
import adaptee.Adaptee;

class GreeterAdapter implements IGreeter {
  private Adaptee adapteeReference;

  public GreeterAdapter(Adaptee adaptee) {
    this.adapteeReference = adaptee;  //stores a reference to an Adaptee object
  }

  public void greet(String name) {
    String myGreet = adapteeReference.sayHello(name);  //uses Adaptee's method
    System.out.println(myGreet);
  }
}
