/**
  * Sebastiano Valle - 05/04/2015
  * This is the class which represents a ``Client" that uses Garden's
  * functionalities.
  *
  * The client has a very simple role in the Decorator pattern (as a matter of
  * fact, GoF omitted it), since he only instantiates a ConcreteGarden
  * (through IGarden interface) that is decorated with some AGardenDecorator(s)
  * elements.
*/
package decorator;

public class Client {

  public static void main(String[] args) {
    IGarden myGarden = new ConcreteGardener( //Decorator1
      new ConcreteGnome( //Decorator2
        new ConcreteGarden())); //Concrete component
    myGarden.whatHappens();
  }
}
