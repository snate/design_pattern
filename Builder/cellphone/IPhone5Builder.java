/**
  * Sebastiano Valle - 23/04/2015
  * This is the class which represents a GoF's ``ConcreteBuilder" class.
  *
  * A Nexus5Builder contains all the operations that are required to build a
  * Nexus5.
*/
package cellphone;

public class IPhone5Builder extends CellBuilder {

  public void buildOS() {
    cell.setOS("iOS 8.3");
  }

  public void buildName() {
    cell.setName("iPhone 5");
  }

  public void buildSize() {
    cell.setScreenSize(4.0);
  }
}
