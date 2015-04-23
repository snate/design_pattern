/**
  * Sebastiano Valle - 23/04/2015
  * This is the class which represents a ``Client" that uses CellMaker's
  * functionalities.
  *
  * The Client is asked only to say which cell he wants to build, then it
  * passes that information to a "cellGuy" which cares about all the building
  * process.
*/
package client;
import cellphone.*;

public class Client {

  public static void main(String[] args) {
    CellMaker cellGuy = new CellMaker();
    CellBuilder myBuilder = new Nexus5Builder();    //type 1 builder
    cellGuy.set(myBuilder);
    cellGuy.make();
    Cellphone nexus = myBuilder.getPhone();

    myBuilder = new IPhone5Builder();    //type 2 builder
    cellGuy.set(myBuilder);
    cellGuy.make();
    Cellphone iphone = myBuilder.getPhone();

    System.out.println(nexus.toString());
    System.out.println(iphone.toString());
  }
}
