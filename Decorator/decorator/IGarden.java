/**
  * Sebastiano Valle - 05/04/2015
  * This is the interface which represents GoF's ``Component" interface.
  *
  * In my example, IGarden offers an operation to print ``what happens in the
  * garden".
  *
  * Hence, since we derive both ConcreteGarden and GardenDecorator(s) from
  * this interface, they'll both be able to accomplish a whatHappens() request.
*/
package decorator;

public interface IGarden {
  void whatHappens();
}
