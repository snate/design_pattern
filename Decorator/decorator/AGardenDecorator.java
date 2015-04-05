/**
  * Sebastiano Valle - 05/04/2015
  * This is the class which represents GoF's ``Decorator" abstract class.
  *
  * This class stores a reference to a IGarden object, which could be either a
  * ConcreteGarden or a ConcreteDecorator.
  *
  * In whatHappens() method, AGardenDecorator istance calls the same operation
  * on the stored IGarden object.
*/
package decorator;

abstract class AGardenDecorator implements IGarden {
  private IGarden gardenObj;  //a reference for recursive calls

  public AGardenDecorator(IGarden obj) {
    gardenObj = obj;  //store reference
  }

  public void whatHappens() {
    gardenObj.whatHappens();  //call whatHappens() recursively
  }
}
