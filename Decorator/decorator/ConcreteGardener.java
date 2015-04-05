/**
  * Sebastiano Valle - 05/04/2015
  * This is the class which represents a GoF's ``ConcreteDecorator" class.
  *
  * A ConcreteGardener adds functionalities to the operation "whatHappens()".
*/
package decorator;

class ConcreteGardener extends AGardenDecorator {
    private static String output = "I'm the gardener and I cut every hedge" +
      "every day";

  public ConcreteGardener(IGarden ref) {
    super(ref);
  }

  public void whatHappens() {
    super.whatHappens();
    System.out.println(output); // additional output given by ConcreteGardener
  }
}
