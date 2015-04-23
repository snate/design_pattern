/**
  * Sebastiano Valle - 23/04/2015
  * This is the class which represents a GoF's ``FactoryA" class.
  *
  * A RedClothesFactory implements the factory methods which were declared in
  * the Abstract Factory superclass ClothesFactory.
*/
package clothes;

public class RedClothesFactory extends ClothesFactory {

  public PairOfShoes createShoes() {
    return new RedPairOfShoes();
  }

  public Shirt createShirt() {
    return new RedShirt();
  }
}
