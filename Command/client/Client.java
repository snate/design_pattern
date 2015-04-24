/**
  * Sebastiano Valle - 24/04/2015
  * This is the class which represents a ``Client" that:
  * <ul>
  * <li>
  *   Creates a ``Receiver"
  * </li>
  * <li>
  *   Links the ``Command" to the ``Receiver"
  * </li>
  * <li>
  *   Store ``Command" into the ``Invoker"
  * </li>
  * </ul>
*/
package client;
import counter.*;

public class Client {

  public static void main(String[] args) {
    Counter cnt = new Counter();
    Command cmd = new CounterCommand(cnt);
    Invoker controller = new Invoker();
    controller.storeCommand("up",cmd);
    controller.start();
  }
}
