/**
  * Sebastiano Valle - 23/04/2015
  * This is the class which represents a GoF's ``FactoryB" class.
  *
  * A BlueClothesFactory implements the factory methods which were declared in
  * the Abstract Factory superclass ClothesFactory.
*/
package clothes;

public class BlueClothesFactory extends ClothesFactory {

  public PairOfShoes createShoes() {
    return new BluePairOfShoes();
  }

  public Shirt createShirt() {
    return new BlueShirt();
  }
}
