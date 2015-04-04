/**
  * Sebastiano Valle - 04/04/2015
  * This is the class which represents GoF's ``Adaptee" class.
  *
  * Adaptee is that class we need to use because it offers particular features.
  *
  * As it might be easily expected, the signature of the operations provided
  * by a class that we find out in an external toolkit isn't the same as ours.
  *
  * Here the Adapter pattern comes in, allowing us to use Adaptee's
  * functionalities without changing client's code.
*/
package adaptee;

public class Adaptee {

  public String sayHello(String name) {
    return new String("Hello dear " + name);
  }

}
