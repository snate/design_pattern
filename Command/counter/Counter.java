/**
  * Sebastiano Valle - 24/04/2015
  * This is the class which represents GoF's ``Receiver" class.
  *
  * A Counter does nothing but increments itself every time that its
  * ``increment()" operation is required, which causes a print of the current
  * value.
*/
package counter;

public class Counter {
  private int number;

  public void increment() {
    number++;
    System.out.println("Now the number is: " + number);
  }
}
