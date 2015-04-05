/**
  * Sebastiano Valle - 05/04/2015
  * This is the class which represents a GoF's ``ConcreteDecorator" class.
  *
  * A ConcreteGnome adds functionalities to the operation "whatHappens()".
*/
package decorator;

class ConcreteGnome extends AGardenDecorator {
    private static String output = "I'm the gnome and I ensure that every" +
    " plant is growing healthy and flourishing";

  public ConcreteGnome(IGarden ref) {
    super(ref);
  }

  public void whatHappens() {
    super.whatHappens();
    System.out.println(output); // additional output given by ConcreteGnome
  }
}
