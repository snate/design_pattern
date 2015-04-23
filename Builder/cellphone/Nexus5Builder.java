/**
  * Sebastiano Valle - 23/04/2015
  * This is the class which represents a GoF's ``ConcreteBuilder" class.
  *
  * A Nexus5Builder contains all the operations that are required to build a
  * Nexus5.
*/
package cellphone;

public class Nexus5Builder extends CellBuilder {

  public void buildOS() {
    cell.setOS("Lollipop 5.1");
  }

  public void buildName() {
    cell.setName("Nexus 5");
  }

  public void buildSize() {
    cell.setScreenSize(4.95);
  }
}
