/**
  * Sebastiano Valle - 23/04/2015
  * This is the class which represents GoF's ``Builder" abstract class.
  *
  * CellBuilder holds all the common functionalities offered by the
  * ConcreteCellBuilders: each one of these has a reference to a cellphone and
  * each one of these provides a ``buildPartX" method.
*/
package cellphone;

public abstract class CellBuilder {
  protected Cellphone cell = new Cellphone();

  public abstract void buildOS();
  public abstract void buildName();
  public abstract void buildSize();
  public Cellphone getPhone() { return cell;}
}
