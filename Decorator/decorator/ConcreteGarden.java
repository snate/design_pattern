/**
  * Sebastiano Valle - 05/04/2015
  * This is the class which represents GoF's ``ConcreteComponent" class.
  *
  * A ConcreteGarden accomplish the basic functionalities that every IGarden
  * is expected to provide.
  *
  * ConcreteGarden doesn't know about the existence of other elements which
  * decorates it, so it is completely indipendent from its additional features.
*/
package decorator;

class ConcreteGarden implements IGarden {

  public void whatHappens() {
    System.out.println("The garden is green and awesome"); // basic output for 
                                                           // ConcreteGarden
  }
}
