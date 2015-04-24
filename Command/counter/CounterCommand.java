/**
  * Sebastiano Valle - 24/04/2015
  * This is the class which represents GoF's ``ConcreteCommand" class.
  *
  * CounterCommand implements the control logic between user inputs and
  * operations on a counter.
*/
package counter;

public class CounterCommand implements Command {
  private Counter cnt;

  public CounterCommand(Counter cnt) {
    this.cnt = cnt;
  }

  public void execute() {
    cnt.increment();
  }
}
