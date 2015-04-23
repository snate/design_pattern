/**
  * Sebastiano Valle - 23/04/2015
  * This is the class which represents GoF's ``Director" class.
  *
  * CellMaker has to encapsulate the building recipe of all the parts of the
  * product.
  *
  * Since the Client doesn't have to know anything about the building process,
  * then it is important to provide a single point of access to start the
  * construction of our product (a cellphone).
*/
package cellphone;

public class CellMaker {
  protected CellBuilder builder;

  public void set(CellBuilder builder) {
    this.builder = builder;
  }

  public void make() {
    builder.buildName();
    builder.buildOS();
    builder.buildSize();
  }
}
