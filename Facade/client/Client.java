/**
  * Sebastiano Valle - 06/04/2015
  * This is the class which represents a ``Client" that uses mySystem's
  * functionalities.
  *
  * The client has a very simple role in the Facade pattern (as a matter of
  * fact, GoF omitted it), since he only instantiates a Facade and make a
  * request to it.
*/
package client;
import analizer.Facade;

public class Client {

  public static void main(String[] args) {
    Facade.INSTANCE.analize(args[0]);
  }
}
